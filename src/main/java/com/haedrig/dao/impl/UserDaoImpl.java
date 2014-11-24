package com.haedrig.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haedrig.dao.IUserDao;
import com.haedrig.entity.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() throws HibernateException { 
		Session session = sessionFactory.getCurrentSession();
		return session;
    }

	@SuppressWarnings("unchecked")
	public List<User> findUsers() {
		return getSession().createQuery("from User")
				.setCacheable(true)//重点
				.list();
	}
	
}
