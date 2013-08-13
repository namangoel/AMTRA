package com.accenture.amtra.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.amtra.dao.BlockDetailsDAO;
import com.accenture.amtra.dao.RoleDetailsDAO;
import com.accenture.amtra.dao.UserDetailsDAO;
import com.accenture.amtra.model.UserModel;
import com.accenture.amtra.persistence.BlockDetailsPersistence;
import com.accenture.amtra.persistence.RoleDetailsPersistence;
import com.accenture.amtra.persistence.UserDetailsPersistence;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDetailsDAO userDetailsDAO;
	
	@Autowired
	BlockDetailsDAO blockDetailsDAO;
	
	@Autowired
	RoleDetailsDAO roleDetailsDAO;

	@Override
	@Transactional
	public void save(UserModel userModel) {
		UserDetailsPersistence userDetailsPersistence = transformModelToPersistence(userModel);
		userDetailsDAO.save(userDetailsPersistence);
	}

	private UserDetailsPersistence transformModelToPersistence(
			UserModel userModel) {
		UserDetailsPersistence userDetailsPersistence = new UserDetailsPersistence();
		BlockDetailsPersistence blockDetailsPersistence = null;
		RoleDetailsPersistence roleDetailsPersistence = null;
		
		Set<BlockDetailsPersistence> blockDetailsSet = null;
		Set<RoleDetailsPersistence> roleDetailsSet = null;
		
		
		userDetailsPersistence.setEmployeeID(Integer.parseInt(userModel.getEmployeeId()));
		userDetailsPersistence.setEmployeeFirstName(userModel.getEmployeeFirstName());
		userDetailsPersistence.setEmployeeLastName(userModel.getEmployeeLastName());
		userDetailsPersistence.setPassword(userModel.getPassword());
		userDetailsPersistence.setEnterpriseId(userModel.getEnterpriseId());
		userDetailsPersistence.setMailId(userModel.getEmailId());
		
		if(userModel.getBlock().length > 0){
			blockDetailsSet = new HashSet<BlockDetailsPersistence>();
			for(String id : userModel.getBlock()){
				blockDetailsPersistence = blockDetailsDAO.getBlockDetail(Integer.parseInt(id));
				blockDetailsSet.add(blockDetailsPersistence);
			}
			userDetailsPersistence.setUserBlockDetailsSet(blockDetailsSet);
		}
		
		if(userModel.getRole() != null){
			roleDetailsSet = new HashSet<RoleDetailsPersistence>();
			
			roleDetailsPersistence = roleDetailsDAO.getRole(Integer.parseInt(userModel.getRole()));
			
			roleDetailsSet.add(roleDetailsPersistence);
			
			userDetailsPersistence.setUserRoleDetailsSet(roleDetailsSet);
		}
		
		return userDetailsPersistence;
	}

}
