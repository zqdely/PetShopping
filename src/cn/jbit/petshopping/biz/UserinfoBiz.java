package cn.jbit.petshopping.biz;

import cn.jbit.petshopping.entity.Userinfo;

public interface UserinfoBiz {
	/**
	 * �����û���¼����ӭ��
	 * @return
	 */
	public Userinfo userLoging(Userinfo user);
	/**
	 * �����û�ע�ᣨ��ӭ��
	 * @return
	 */
	public int userRegister(Userinfo user);
}
