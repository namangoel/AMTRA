package com.accenture.amtra.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="SLA_DETAIL")
public class SlaDetailPersistence {

	@Id
	@Column(name="SLA_ID")
	private Integer slaId;
	
	@Column(name="SLA_HOURS")
	private Integer slaHours;
	
	@Column(name="SLA_COMMENTS")
	private String slaComments;
	
	@Column(name="SLA_TYPE")
	private String slaType;
	
	@Column(name="SLA_NAME")
	private String slaName;
	
	@Column(name="SLA_DESC")
	private String slaDesc;
	
	@ManyToOne
	@JoinColumn(name="SEV_ID")
	private SeverityDetailsPersistence severityDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="TYPE_ID")
	private TicketTypePersistence ticketTypePersistence;

	public Integer getSlaId() {
		return slaId;
	}

	public void setSlaId(Integer slaId) {
		this.slaId = slaId;
	}

	public Integer getSlaHours() {
		return slaHours;
	}

	public void setSlaHours(Integer slaHours) {
		this.slaHours = slaHours;
	}

	public String getSlaComments() {
		return slaComments;
	}

	public void setSlaComments(String slaComments) {
		this.slaComments = slaComments;
	}

	public String getSlaType() {
		return slaType;
	}

	public void setSlaType(String slaType) {
		this.slaType = slaType;
	}

	public String getSlaName() {
		return slaName;
	}

	public void setSlaName(String slaName) {
		this.slaName = slaName;
	}

	public String getSlaDesc() {
		return slaDesc;
	}

	public void setSlaDesc(String slaDesc) {
		this.slaDesc = slaDesc;
	}

	public SeverityDetailsPersistence getSeverityDetailsPersistence() {
		return severityDetailsPersistence;
	}

	public void setSeverityDetailsPersistence(
			SeverityDetailsPersistence severityDetailsPersistence) {
		this.severityDetailsPersistence = severityDetailsPersistence;
	}

	public TicketTypePersistence getTicketTypePersistence() {
		return ticketTypePersistence;
	}

	public void setTicketTypePersistence(TicketTypePersistence ticketTypePersistence) {
		this.ticketTypePersistence = ticketTypePersistence;
	}
}
