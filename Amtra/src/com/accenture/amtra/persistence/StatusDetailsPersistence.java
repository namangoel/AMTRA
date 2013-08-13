package com.accenture.amtra.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="STATUS_DETAILS")
public class StatusDetailsPersistence {
	
	@Id
	@Column(name="TICKET_STATUS_ID")
	private Integer ticketStatusId;
	
	@Column(name="TICKET_STATUS_NAME")
	private String ticketStatusName;
	
	@Column(name="TICKET_STATUS_DESC")
	private String ticketStatusDesc;

	public Integer getTicketStatusId() {
		return ticketStatusId;
	}

	public void setTicketStatusId(Integer ticketStatusId) {
		this.ticketStatusId = ticketStatusId;
	}

	public String getTicketStatusName() {
		return ticketStatusName;
	}

	public void setTicketStatusName(String ticketStatusName) {
		this.ticketStatusName = ticketStatusName;
	}

	public String getTicketStatusDesc() {
		return ticketStatusDesc;
	}

	public void setTicketStatusDesc(String ticketStatusDesc) {
		this.ticketStatusDesc = ticketStatusDesc;
	}


}
