package com.accenture.amtra.persistence;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="USER_DETAILS")
public class UserDetailsPersistence {
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private Integer employeeID;
	
	@Column(name="EMPLOYEE_FIRST_NAME")
	private String employeeFirstName;
	
	@Column(name="EMPPLOYEE_LAST_NAME")
	private String employeeLastName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@Column(name="ENTERPRISE_ID")
	private String enterpriseId;
	
	@Column(name="MAIL_ID")
	private String mailId;
	
	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="USER_ROLES_ASSOCIATION",
		joinColumns = {@JoinColumn(name="EMPLOYEE_ID", referencedColumnName="EMPLOYEE_ID")},
		inverseJoinColumns = {@JoinColumn(name="ROLE_ID", referencedColumnName="ROLE_ID")}
	)
	private Set<RoleDetailsPersistence> userRoleDetailsSet;

	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="USER_BLOCK_ASSOCIATION",
		joinColumns = {@JoinColumn(name="EMPLOYEE_ID", referencedColumnName="EMPLOYEE_ID")},
		inverseJoinColumns = {@JoinColumn(name="BLOCK_ID", referencedColumnName="BLOCK_ID")}
	)
	private Set<BlockDetailsPersistence> userBlockDetailsSet;
	
	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="USER_SSA_ASSOCIATION",
		joinColumns = {@JoinColumn(name="EMPLOYEE_ID", referencedColumnName="EMPLOYEE_ID")},
		inverseJoinColumns = {@JoinColumn(name="SSA_ID", referencedColumnName="SSA_ID")}
	)
	private Set<SsaDetailsPersistence> userSsaDetailsSet;
	
	/*@ManyToMany(mappedBy="userRoleDetailsSet")
	private Set<RoleDetailsPersistence> roleDetailsSet;
	@ManyToMany(mappedBy="userBlockDetailsSet")
	private Set<BlockDetailsPersistence> blockDetailsSet;
	@ManyToMany(mappedBy="userSsaDetailsSet")
	private Set<SsaDetailsPersistence> ssaDetailsSet;*/
	
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Set<RoleDetailsPersistence> getUserRoleDetailsSet() {
		return userRoleDetailsSet;
	}
	public void setUserRoleDetailsSet(Set<RoleDetailsPersistence> userRoleDetailsSet) {
		this.userRoleDetailsSet = userRoleDetailsSet;
	}
	public Set<BlockDetailsPersistence> getUserBlockDetailsSet() {
		return userBlockDetailsSet;
	}
	public void setUserBlockDetailsSet(
			Set<BlockDetailsPersistence> userBlockDetailsSet) {
		this.userBlockDetailsSet = userBlockDetailsSet;
	}
	public Set<SsaDetailsPersistence> getUserSsaDetailsSet() {
		return userSsaDetailsSet;
	}
	public void setUserSsaDetailsSet(Set<SsaDetailsPersistence> userSsaDetailsSet) {
		this.userSsaDetailsSet = userSsaDetailsSet;
	}
	

}
