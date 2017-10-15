package cn.jbit.petshopping.dao;

import cn.jbit.petshopping.entity.Userinfo;

public interface UserinfoDao {
	/**
	 * 用于用户登录（李迎）
	 * @return
	 */
	public Userinfo userLoging(Userinfo user);
	/**
	 * 用于用户注册（李迎）
	 * @return
	 */
	public int userRegister(Userinfo user);
}
