package com.accenture.amtra.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.amtra.persistence.BlockDetailsPersistence;

@Repository
@Transactional
public class BlockDetailsDAOImpl implements BlockDetailsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public BlockDetailsPersistence getBlockDetail(Integer id) {
		BlockDetailsPersistence blockDetailsPersistence = (BlockDetailsPersistence)getCurrentSession().get(BlockDetailsPersistence.class, id);
		return blockDetailsPersistence;
	}

	@Override
	public void saveOrUpdate(BlockDetailsPersistence blockDetailsPersistence) {
		try {
			getCurrentSession().merge(blockDetailsPersistence);
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<BlockDetailsPersistence> getAllBlockDetails() {
		List<BlockDetailsPersistence> blockDetailList = null;
		try {
			blockDetailList = getCurrentSession().createCriteria(BlockDetailsPersistence.class).list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return blockDetailList;
	}

}
