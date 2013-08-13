package com.accenture.amtra.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.accenture.amtra.persistence.UserDetailsPersistence;

@Repository
public class UserDetailsDAOImpl implements UserDetailsDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}


	public UserDetailsPersistence getUser(String login) {
		UserDetailsPersistence userDetailsPersistence = null;
		try {
			
			getCurrentSession().beginTransaction();
			Criteria criteria = getCurrentSession().createCriteria(UserDetailsPersistence.class);
			criteria.add(Restrictions.eq("enterpriseId", login));
			
			userDetailsPersistence = (UserDetailsPersistence)criteria.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userDetailsPersistence;
	}


	@Override
	public void save(UserDetailsPersistence userDetailsPersistence) {
		try {
			getCurrentSession().save(userDetailsPersistence);
			getCurrentSession().flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<UserDetailsPersistence> getAllUser() {
		List<UserDetailsPersistence> userDetailList = null;
		try {
			userDetailList = getCurrentSession().createCriteria(UserDetailsPersistence.class).list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return userDetailList;
	}


	@Override
	public void removeUser(UserDetailsPersistence userDetailsPersistence) {
		try {
			getCurrentSession().delete(userDetailsPersistence);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
