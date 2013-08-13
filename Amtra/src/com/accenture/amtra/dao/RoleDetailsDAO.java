package com.accenture.amtra.dao;

import java.util.List;

import com.accenture.amtra.persistence.RoleDetailsPersistence;


public interface RoleDetailsDAO {

	RoleDetailsPersistence getRole(int id);
	List<RoleDetailsPersistence> getAllRole();
}
