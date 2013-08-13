package com.accenture.amtra.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="TICKET_TRANSACTION_HISTORY")
public class TicketTransactionHistoryPersistenc {

	@Id
	@Column(name="ACTIVITY_ID")
	private Integer activityId;
	
	@Column(name="MOVED_TIME")
	private Date movedTime;
	
	@Column(name="TICKET_COMMENTS")
	private String ticketComments;
	
	@ManyToOne
	@JoinColumn(name="FROM_TICKET_STATUS_ID")
	private StatusDetailsPersistence fromStatusDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="TO_TICKET_STATUS_ID")
	private StatusDetailsPersistence toStatusDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="FROM_QUEUE_ID")
	private QueueDetailsPersistence fromQueueDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="TO_QUEUE_ID")
	private QueueDetailsPersistence toQueueDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="MODIFIED_BY")
	private UserDetailsPersistence userDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="TICKET_ID")
	private TicketDetailsPersistence ticketDetailsPersistence;

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Date getMovedTime() {
		return movedTime;
	}

	public void setMovedTime(Date movedTime) {
		this.movedTime = movedTime;
	}


	public String getTicketComments() {
		return ticketComments;
	}

	public void setTicketComments(String ticketComments) {
		this.ticketComments = ticketComments;
	}

	public StatusDetailsPersistence getFromStatusDetailsPersistence() {
		return fromStatusDetailsPersistence;
	}

	public void setFromStatusDetailsPersistence(
			StatusDetailsPersistence fromStatusDetailsPersistence) {
		this.fromStatusDetailsPersistence = fromStatusDetailsPersistence;
	}

	public StatusDetailsPersistence getToStatusDetailsPersistence() {
		return toStatusDetailsPersistence;
	}

	public void setToStatusDetailsPersistence(
			StatusDetailsPersistence toStatusDetailsPersistence) {
		this.toStatusDetailsPersistence = toStatusDetailsPersistence;
	}

	public QueueDetailsPersistence getFromQueueDetailsPersistence() {
		return fromQueueDetailsPersistence;
	}

	public void setFromQueueDetailsPersistence(
			QueueDetailsPersistence fromQueueDetailsPersistence) {
		this.fromQueueDetailsPersistence = fromQueueDetailsPersistence;
	}

	public QueueDetailsPersistence getToQueueDetailsPersistence() {
		return toQueueDetailsPersistence;
	}

	public void setToQueueDetailsPersistence(
			QueueDetailsPersistence toQueueDetailsPersistence) {
		this.toQueueDetailsPersistence = toQueueDetailsPersistence;
	}

	public UserDetailsPersistence getUserDetailsPersistence() {
		return userDetailsPersistence;
	}

	public void setUserDetailsPersistence(
			UserDetailsPersistence userDetailsPersistence) {
		this.userDetailsPersistence = userDetailsPersistence;
	}

	public TicketDetailsPersistence getTicketDetailsPersistence() {
		return ticketDetailsPersistence;
	}

	public void setTicketDetailsPersistence(
			TicketDetailsPersistence ticketDetailsPersistence) {
		this.ticketDetailsPersistence = ticketDetailsPersistence;
	}
		

}
