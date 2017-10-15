package cn.jbit.petshopping.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import cn.jbit.petshopping.dao.BaseHibernateDao;
import cn.jbit.petshopping.dao.UserinfoDao;
import cn.jbit.petshopping.entity.Userinfo;
import cn.jbit.petshopping.util.SendEmail;

public class UserinfoDaoImpl extends BaseHibernateDao implements UserinfoDao {

	public Userinfo userLoging(Userinfo user) {
		Session session = super.getSession();
		//采用动态数据查询实现用户登录
		Criteria criteria = session.createCriteria(Userinfo.class);
		if(user.getName()!=(null)){
			criteria.add(Restrictions.eq("name", user.getName()));
		}
		if(user.getEmail()!=(null)){
			criteria.add(Restrictions.eq("email", user.getEmail()));
		}
		criteria.add(Restrictions.eq("password", user.getPassword()));
		Userinfo users = (Userinfo) criteria.uniqueResult();
		return users;
	}

	public int userRegister(Userinfo user) {
		Session session = super.getSession();
		Transaction tx = null;
		int num = 0;
		try {
			tx = session.beginTransaction();
			num = (Integer) session.save(user);
			//邮件验证
			SendEmail.send(user);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		super.closeSession();
		return num;
	}

}
