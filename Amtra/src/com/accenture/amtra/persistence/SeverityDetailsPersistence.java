package com.accenture.amtra.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="SEVERITY_DETAILS")
public class SeverityDetailsPersistence {

	@Id
	@Column(name="SEV_ID")
	private Integer sevId;
	
	@Column(name="SEV_CODE")
	private String sevCode;

	public Integer getSevId() {
		return sevId;
	}

	public void setSevId(Integer sevId) {
		this.sevId = sevId;
	}

	public String getSevCode() {
		return sevCode;
	}

	public void setSevCode(String sevCode) {
		this.sevCode = sevCode;
	}
}
