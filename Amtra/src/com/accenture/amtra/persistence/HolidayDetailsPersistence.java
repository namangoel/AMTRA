package com.accenture.amtra.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="HOLIDAY_DETAILS")
public class HolidayDetailsPersistence {

	@Id
	@Column(name="DATE_ID")
	private Integer dateId;
	
	@Column(name="DATE")
	private Date date;
	
	@Column(name="HOLIDAY_TYPE")
	private String holidayType;
	
	@Column(name="HOLIDAY_DESC")
	private String holidayDesc;

	public Integer getDateId() {
		return dateId;
	}

	public void setDateId(Integer dateId) {
		this.dateId = dateId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHolidayType() {
		return holidayType;
	}

	public void setHolidayType(String holidayType) {
		this.holidayType = holidayType;
	}

	public String getHolidayDesc() {
		return holidayDesc;
	}

	public void setHolidayDesc(String holidayDesc) {
		this.holidayDesc = holidayDesc;
	}

}
