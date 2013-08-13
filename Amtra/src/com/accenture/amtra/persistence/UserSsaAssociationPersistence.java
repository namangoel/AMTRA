package com.accenture.amtra.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="USER_SSA_ASSOCIATION")
public class UserSsaAssociationPersistence implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4841058668292790801L;

	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;
	
	@Column(name="SSA_ID")
	private Integer ssaId;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getSsaId() {
		return ssaId;
	}

	public void setSsaId(Integer ssaId) {
		this.ssaId = ssaId;
	}
}
