package com.accenture.amtra.persistence;

import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="ATTACHMENT_DETAILS")
public class AttachmentDetailsPersistence {

	@Id
	@Column(name="ATTACHMENT_ID")
	private Integer attachmentId;
	
	@Column(name="COMMENTS")
	private String comments;
	
	@Column(name="ATTACHMENTS")
	private Clob attachments;
	
	
	@ManyToOne
	@JoinColumn(name="ACTIVITY_ID")
	private TicketTransactionHistoryPersistenc ticketTransactionHistoryPersistenc;


	public Integer getAttachmentId() {
		return attachmentId;
	}


	public void setAttachmentId(Integer attachmentId) {
		this.attachmentId = attachmentId;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public Clob getAttachments() {
		return attachments;
	}


	public void setAttachments(Clob attachments) {
		this.attachments = attachments;
	}


	public TicketTransactionHistoryPersistenc getTicketTransactionHistoryPersistenc() {
		return ticketTransactionHistoryPersistenc;
	}


	public void setTicketTransactionHistoryPersistenc(
			TicketTransactionHistoryPersistenc ticketTransactionHistoryPersistenc) {
		this.ticketTransactionHistoryPersistenc = ticketTransactionHistoryPersistenc;
	}

}
