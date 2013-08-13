package com.accenture.amtra.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="USER_BLOCK_ASSOCIATION")
public class UserBlockAssociationPersistence implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7916108922232998162L;

	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;
	
	@Column(name="BLOCK_ID")
	private Integer blockId;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getBlockId() {
		return blockId;
	}

	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
	}

}
