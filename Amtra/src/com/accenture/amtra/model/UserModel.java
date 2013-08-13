package com.accenture.amtra.model;

public class UserModel {
	
	public UserModel() {
		setModify(false);
	}

	/**
	 * The following string are used for textfield in the form
	 */
	private String employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String password;
	private String confirmPassword;
	private String enterpriseId;
	private String emailId;
	private Boolean modify;
	
	/**
	 * It is used for checkbox in the form
	 */
	private String [] block;
	
	/**
	 * It is used for dropdown menu in the form
	 */
	private String role;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String[] getBlock() {
		return block;
	}

	public void setBlock(String[] block) {
		this.block = block;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getModify() {
		return modify;
	}

	public void setModify(Boolean modify) {
		this.modify = modify;
	}
	
}
