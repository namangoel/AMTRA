package com.accenture.amtra.persistence;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="USER_TRANSACTION_HISTORY")
public class UserTransactionHistoryPersistence {
	
	@Id
	@Column(name="USER_ACTIVITY_ID")
	private Integer userActivityId;
	
	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;
	
	@Column(name="TABLE_NAME")
	private String tableName;
	
	@Column(name="TRANSACTION_TIME")
	private Timestamp transactionTime;
	
	@Column(name="TABLE_PK")
	private Integer tablePk;

	public Integer getUserActivityId() {
		return userActivityId;
	}

	public void setUserActivityId(Integer userActivityId) {
		this.userActivityId = userActivityId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Timestamp getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Timestamp transactionTime) {
		this.transactionTime = transactionTime;
	}

	public Integer getTablePk() {
		return tablePk;
	}

	public void setTablePk(Integer tablePk) {
		this.tablePk = tablePk;
	}


}
