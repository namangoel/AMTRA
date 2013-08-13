package com.accenture.amtra.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="TICKET_DETAILS")
public class TicketDetailsPersistence {
	
	@Id
	@Column(name="TICKET_ID")
	private Integer ticketId;
	
	@Column(name="CLARIFY_TICKET_NUMBER")
	private String clarifyTicketNumber;
	
	@Column(name="TICKET_START_DATE")
	private Date ticketStartDate;
	
	@Column(name="FIXE_DATE")
	private Date fixeDate;
		
	@Column(name="RESOLU_DATE")
	private Date resoluDate;
	
	@Column(name="TICKET_REQUESTOR")
	private String ticketRequestor;
	
	@Column(name="REQUESTOR_MAIL_ID")
	private String requestorMailId;
	
	@Column(name="TICKET_DESC")
	private String ticketDesc;
	
	@Column(name="TICKET_DELETE_FLAG")
	private String ticketDeleteFlag;
		
	@Column(name="TICKET_TITLE")
	private String ticketTitle;
		
	@ManyToOne
	@JoinColumn(name="TICKET_TYPE_ID")
	private TicketTypePersistence ticketTypePersistence;
	
	@ManyToOne
	@JoinColumn(name="BLOCK_ID")
	private BlockDetailsPersistence blockDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="SSA_ID")
	private SsaDetailsPersistence ssaDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="TICKET_STATUS_ID")
	private StatusDetailsPersistence statusDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="EMPLOYEE_ID")
	private UserDetailsPersistence userDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="MTP_ID")
	private MtpDetailsPersistence mtpDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="TICKET_QUEUE_ID")
	private QueueDetailsPersistence queueDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="TICKET_SEV_ID")
	private SeverityDetailsPersistence severityDetailsPersistence;

	public QueueDetailsPersistence getQueueDetailsPersistence() {
		return queueDetailsPersistence;
	}

	public void setQueueDetailsPersistence(
			QueueDetailsPersistence queueDetailsPersistence) {
		this.queueDetailsPersistence = queueDetailsPersistence;
	}

	public SeverityDetailsPersistence getSeverityDetailsPersistence() {
		return severityDetailsPersistence;
	}

	public void setSeverityDetailsPersistence(
			SeverityDetailsPersistence severityDetailsPersistence) {
		this.severityDetailsPersistence = severityDetailsPersistence;
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}


	public String getClarifyTicketNumber() {
		return clarifyTicketNumber;
	}

	public void setClarifyTicketNumber(String clarifyTicketNumber) {
		this.clarifyTicketNumber = clarifyTicketNumber;
	}


	public Date getTicketStartDate() {
		return ticketStartDate;
	}

	public void setTicketStartDate(Date ticketStartDate) {
		this.ticketStartDate = ticketStartDate;
	}

	public Date getFixeDate() {
		return fixeDate;
	}

	public void setFixeDate(Date fixeDate) {
		this.fixeDate = fixeDate;
	}

	public Date getResoluDate() {
		return resoluDate;
	}

	public void setResoluDate(Date resoluDate) {
		this.resoluDate = resoluDate;
	}


	public String getTicketRequestor() {
		return ticketRequestor;
	}

	public void setTicketRequestor(String ticketRequestor) {
		this.ticketRequestor = ticketRequestor;
	}

	public String getRequestorMailId() {
		return requestorMailId;
	}

	public void setRequestorMailId(String requestorMailId) {
		this.requestorMailId = requestorMailId;
	}

	public String getTicketDesc() {
		return ticketDesc;
	}

	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}

	public String getTicketDeleteFlag() {
		return ticketDeleteFlag;
	}

	public void setTicketDeleteFlag(String ticketDeleteFlag) {
		this.ticketDeleteFlag = ticketDeleteFlag;
	}

	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public TicketTypePersistence getTicketTypePersistence() {
		return ticketTypePersistence;
	}

	public void setTicketTypePersistence(TicketTypePersistence ticketTypePersistence) {
		this.ticketTypePersistence = ticketTypePersistence;
	}

	public BlockDetailsPersistence getBlockDetailsPersistence() {
		return blockDetailsPersistence;
	}

	public void setBlockDetailsPersistence(
			BlockDetailsPersistence blockDetailsPersistence) {
		this.blockDetailsPersistence = blockDetailsPersistence;
	}

	public SsaDetailsPersistence getSsaDetailsPersistence() {
		return ssaDetailsPersistence;
	}

	public void setSsaDetailsPersistence(SsaDetailsPersistence ssaDetailsPersistence) {
		this.ssaDetailsPersistence = ssaDetailsPersistence;
	}

	public StatusDetailsPersistence getStatusDetailsPersistence() {
		return statusDetailsPersistence;
	}

	public void setStatusDetailsPersistence(
			StatusDetailsPersistence statusDetailsPersistence) {
		this.statusDetailsPersistence = statusDetailsPersistence;
	}

	public UserDetailsPersistence getUserDetailsPersistence() {
		return userDetailsPersistence;
	}

	public void setUserDetailsPersistence(
			UserDetailsPersistence userDetailsPersistence) {
		this.userDetailsPersistence = userDetailsPersistence;
	}

	public MtpDetailsPersistence getMtpDetailsPersistence() {
		return mtpDetailsPersistence;
	}

	public void setMtpDetailsPersistence(MtpDetailsPersistence mtpDetailsPersistence) {
		this.mtpDetailsPersistence = mtpDetailsPersistence;
	}
	

}
