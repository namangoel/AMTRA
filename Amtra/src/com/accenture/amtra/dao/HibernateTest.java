package com.accenture.amtra.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.accenture.amtra.persistence.BlockDetailsPersistence;
import com.accenture.amtra.persistence.RoleDetailsPersistence;
import com.accenture.amtra.persistence.UserDetailsPersistence;

public class HibernateTest {
	
	SessionFactory sessionFactory = null;
	Session session = null;
	
	public void addBlock(){
		
		BlockDetailsPersistence blockDetailsFirst = new BlockDetailsPersistence();
		
		blockDetailsFirst.setBlockId(1);
		blockDetailsFirst.setBlockName("BA06");
		blockDetailsFirst.setBlockDesc("block 06");
		
		BlockDetailsPersistence blockDetailsSecond = new BlockDetailsPersistence();
		
		blockDetailsSecond.setBlockId(2);
		blockDetailsSecond.setBlockName("BA08");
		blockDetailsSecond.setBlockDesc("block 08");
		
		session.beginTransaction();
		session.save(blockDetailsFirst);
		session.save(blockDetailsSecond);
	}
	
	public void addRole(){

		RoleDetailsPersistence roleDetailsFirst = new RoleDetailsPersistence();
		RoleDetailsPersistence roleDetailsSecond = new RoleDetailsPersistence();
		
		roleDetailsFirst.setRoleId(1);
		roleDetailsFirst.setRoleName("ROLE_ADMIN");
		roleDetailsFirst.setRoleDesc("ADMIN");
		
		roleDetailsSecond.setRoleId(2);
		roleDetailsSecond.setRoleName("ROLE_MODERATOR");
		roleDetailsSecond.setRoleDesc("MOD");
		
		session.beginTransaction();
		session.save(roleDetailsFirst);
		session.save(roleDetailsSecond);
	
	}
	
	public void addUser() {
		UserDetailsPersistence userDetailsFirst = new UserDetailsPersistence();
		BlockDetailsPersistence blockDetails ;
		RoleDetailsPersistence roleDetailsPersistence;
		
		Set<BlockDetailsPersistence> blockDetailSet = new HashSet<BlockDetailsPersistence>();
		Set<RoleDetailsPersistence> roleDetailSet = new HashSet<RoleDetailsPersistence>();
		
		
		UserDetailsPersistence userDetailsSecond = new UserDetailsPersistence();

		userDetailsFirst.setEmployeeID(1);
		userDetailsFirst.setEmployeeFirstName("Rashid");
		userDetailsFirst.setEmployeeLastName("Dilawar");
		userDetailsFirst.setPassword("p");
		
		userDetailsSecond.setEmployeeID(2);
		userDetailsSecond.setEmployeeFirstName("Second");
		userDetailsSecond.setEmployeeLastName("S User");
		userDetailsSecond.setPassword("p");

		session.beginTransaction();
		
		 roleDetailsPersistence = (RoleDetailsPersistence)session.load(RoleDetailsPersistence.class, 1);
		 roleDetailSet.add(roleDetailsPersistence);
		 
		 blockDetails  = (BlockDetailsPersistence)session.load(BlockDetailsPersistence.class, 1);
		 blockDetailSet.add(blockDetails);
		 
		 userDetailsFirst.setUserRoleDetailsSet(roleDetailSet);
		 userDetailsFirst.setUserBlockDetailsSet(blockDetailSet);
		 
		 
		session.save(userDetailsFirst);
		
		roleDetailSet = new HashSet<RoleDetailsPersistence>();
		blockDetailSet = new HashSet<BlockDetailsPersistence>();
		 roleDetailsPersistence = (RoleDetailsPersistence)session.load(RoleDetailsPersistence.class, 2);
		 roleDetailSet.add(roleDetailsPersistence);
		 blockDetails  = (BlockDetailsPersistence)session.load(BlockDetailsPersistence.class, 2);
		 blockDetailSet.add(blockDetails);
		 
		 
		 userDetailsSecond.setUserRoleDetailsSet(roleDetailSet);
		 userDetailsSecond.setUserBlockDetailsSet(blockDetailSet);
		 
		 
		session.save(userDetailsSecond);
	}
	
	public void removeUser() {
		UserDetailsPersistence userDetailsFirst = null;

		session.beginTransaction();

		userDetailsFirst = (UserDetailsPersistence) session
				.createCriteria(UserDetailsPersistence.class)
				.add(Restrictions.eq("employeeID", 2)).uniqueResult();
		session.delete(userDetailsFirst);

	}
	
	public static void main(String[] args) {
		HibernateTest hibernateTest = new HibernateTest();
		try {
			hibernateTest.sessionFactory =  new Configuration().configure().buildSessionFactory();
			hibernateTest.session = hibernateTest.sessionFactory.openSession();
			/*hibernateTest.addBlock();
			hibernateTest.addRole();
			hibernateTest.addUser();*/
			hibernateTest.removeUser();
			hibernateTest.session.flush();
			hibernateTest.session.getTransaction().commit();
			hibernateTest.session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
}
