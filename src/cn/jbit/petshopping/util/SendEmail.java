package cn.jbit.petshopping.util;

import cn.jbit.petshopping.entity.Userinfo;

public class SendEmail {
	public static void send(Userinfo user){
		//�������Ҫ�������ʼ�     
	      MailSenderInfo mailInfo = new MailSenderInfo();
	      String[] parama = {"welcome","you"};
	      mailInfo.setAttachFileNames(parama);
	      mailInfo.setMailServerHost("smtp.163.com");      
	      mailInfo.setMailServerPort("25");      
	      mailInfo.setValidate(true);      
	      mailInfo.setUserName("zqdely@163.com");      
	      mailInfo.setPassword("19901006ly");//������������      
	      mailInfo.setFromAddress("zqdely@163.com");      
	      mailInfo.setToAddress(user.getEmail());      
	      mailInfo.setSubject(user.getName()+"��ӭ���ļ���");      
	      mailInfo.setContent("�뼰ʱȷ����Ϣ,��<a href='localhost:8080/PetShopping/login.jsp'>����</a>��������˺�,�����ڴ����ĵ���!");      
	         //�������Ҫ�������ʼ�     
	      try {
			SimpleMailSender.sendHtmlMail(mailInfo);//����html��ʽ 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
