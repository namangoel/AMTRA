package com.accenture.amtra.persistence;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="ROLE_DETAILS")
public class RoleDetailsPersistence {

	@Id
	@Column(name="ROLE_ID")
	private Integer roleId;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@Column(name="ROLE_DESC")
	private String roleDesc;
	
	/*@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="USER_ROLES_ASSOCIATION", 
		joinColumns = {@JoinColumn(name="ROLE_ID", referencedColumnName="ROLE_ID")},
		inverseJoinColumns = {@JoinColumn(name="EMPLOYEE_ID", referencedColumnName="EMPLOYEE_ID")}
	)
	private Set<UserDetailsPersistence> userRoleDetailsSet;*/
	
	@ManyToMany(mappedBy="userRoleDetailsSet")
	private Set<UserDetailsPersistence> userRoleDetailsSet;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public Set<UserDetailsPersistence> getUserRoleDetailsSet() {
		return userRoleDetailsSet;
	}

	public void setUserRoleDetailsSet(Set<UserDetailsPersistence> userRoleDetailsSet) {
		this.userRoleDetailsSet = userRoleDetailsSet;
	}


}
