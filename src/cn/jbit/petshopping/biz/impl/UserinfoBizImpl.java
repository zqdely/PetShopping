package cn.jbit.petshopping.biz.impl;

import cn.jbit.petshopping.biz.UserinfoBiz;
import cn.jbit.petshopping.dao.UserinfoDao;
import cn.jbit.petshopping.dao.impl.UserinfoDaoImpl;
import cn.jbit.petshopping.entity.Userinfo;

public class UserinfoBizImpl implements UserinfoBiz {

	public Userinfo userLoging(Userinfo user) {
		UserinfoDao uid = new  UserinfoDaoImpl();
		Userinfo users = uid.userLoging(user);
		return users;
	}

	public int userRegister(Userinfo user) {
		UserinfoDao uid = new  UserinfoDaoImpl();
		int num = uid.userRegister(user);
		return num;
	}

}
