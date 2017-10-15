package cn.jbit.petshopping.web;

import java.util.Map;

import cn.jbit.petshopping.biz.UserinfoBiz;
import cn.jbit.petshopping.biz.impl.UserinfoBizImpl;
import cn.jbit.petshopping.entity.Userinfo;
import cn.jbit.petshopping.util.MailSenderInfo;
import cn.jbit.petshopping.util.SendEmail;
import cn.jbit.petshopping.util.SimpleMailSender;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * �����û�ע���¼����ӭ��
 * @author lenovo
 *
 */
public class UserOprationServlet extends ActionSupport {
	private String username;
	private Userinfo user;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(username.lastIndexOf("@")>0){
			user.setEmail(username);
		}else{
			user.setName(username);
		}
		this.username = username;
	}

	public Userinfo getUser() {
		return user;
	}

	public void setUser(Userinfo user) {
		this.user = user;
	}
	/**
	 * ��¼
	 * @return
	 */
	public String Login(){
		UserinfoBiz uib = new UserinfoBizImpl();
		Userinfo users = uib.userLoging(user);
		if(users!=null){
			//�ж������Ƿ񼤻�
			if(user.getActivation()==1){
				Map<String, Object> session = ActionContext.getContext().getSession();
				session.put("userinfo", users);
				return SUCCESS;
			}else{
				//����û�м���
				return INPUT;
			}
			
		}else{
			//�û������벻��ȷ
			return INPUT;
		}
	}
	/**
	 * ע��
	 */
	public String Register(){
		UserinfoBiz uib = new UserinfoBizImpl();
		int num = uib.userRegister(user);
		if(num > 0){
			return SUCCESS;
		}else{
			return INPUT;
		}
	}
}
