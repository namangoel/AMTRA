package com.accenture.amtra.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.amtra.persistence.RoleDetailsPersistence;

@Repository
@Transactional
public class RoleDetailsDAOImpl implements RoleDetailsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public RoleDetailsPersistence getRole(int id) {
		RoleDetailsPersistence roleDetailsPersistence = (RoleDetailsPersistence)getCurrentSession().get(RoleDetailsPersistence.class, id);
			return roleDetailsPersistence;
	}

	@Override
	public List<RoleDetailsPersistence> getAllRole() {
		List<RoleDetailsPersistence> roleDetailsList = null;
		try {
			roleDetailsList = getCurrentSession().createCriteria(RoleDetailsPersistence.class).list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return roleDetailsList;
	}

}
