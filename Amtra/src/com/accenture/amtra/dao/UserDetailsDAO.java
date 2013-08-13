package com.accenture.amtra.dao;

import java.util.List;

import com.accenture.amtra.persistence.UserDetailsPersistence;

public interface UserDetailsDAO {

	UserDetailsPersistence getUser(String login);
	void save(UserDetailsPersistence userDetailsPersistence);
	List<UserDetailsPersistence> getAllUser();
	void removeUser(UserDetailsPersistence userDetailsPersistence);
}
