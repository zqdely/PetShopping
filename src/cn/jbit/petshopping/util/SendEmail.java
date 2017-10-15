package cn.jbit.petshopping.util;

import cn.jbit.petshopping.entity.Userinfo;

public class SendEmail {
	public static void send(Userinfo user){
		//这个类主要是设置邮件     
	      MailSenderInfo mailInfo = new MailSenderInfo();
	      String[] parama = {"welcome","you"};
	      mailInfo.setAttachFileNames(parama);
	      mailInfo.setMailServerHost("smtp.163.com");      
	      mailInfo.setMailServerPort("25");      
	      mailInfo.setValidate(true);      
	      mailInfo.setUserName("zqdely@163.com");      
	      mailInfo.setPassword("19901006ly");//您的邮箱密码      
	      mailInfo.setFromAddress("zqdely@163.com");      
	      mailInfo.setToAddress(user.getEmail());      
	      mailInfo.setSubject(user.getName()+"欢迎您的加入");      
	      mailInfo.setContent("请及时确认信息,并<a href='localhost:8080/PetShopping/login.jsp'>激活</a>激活你的账号,我们期待您的到来!");      
	         //这个类主要来发送邮件     
	      try {
			SimpleMailSender.sendHtmlMail(mailInfo);//发送html格式 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
