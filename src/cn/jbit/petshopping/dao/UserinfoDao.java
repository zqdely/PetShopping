package cn.jbit.petshopping.dao;

import cn.jbit.petshopping.entity.Userinfo;

public interface UserinfoDao {
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
