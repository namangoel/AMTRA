package com.accenture.amtra.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="USER_ROLES_ASSOCIATION")
public class UserRolesAssociationPersistence implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5664087280930938152L;

	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;
	
	@Column(name="ROLE_ID")
	private Integer roleId;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
