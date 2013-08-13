package com.accenture.amtra.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="TICKET_TYPE")
public class TicketTypePersistence {

	@Id
	@Column(name="TICKET_TYPE_ID")
	private Integer ticketTypeId;
	
	@Column(name="TYPE_NAME")
	private String typeName;
	
	@Column(name="TYPE_DESCRIPTION")
	private String typeDescription;

	public Integer getTicketTypeId() {
		return ticketTypeId;
	}

	public void setTicketTypeId(Integer ticketTypeId) {
		this.ticketTypeId = ticketTypeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

}
