package com.accenture.amtra.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="QUEUE_DETAILS")
public class QueueDetailsPersistence {

	@Id
	@Column(name="QUEUE_ID")
	private Integer queueId;
	
	@Column(name="QUEUE_CODE")
	private String queueCode;
	
	@Column(name="QUEUE_DESC")
	private String queueDesc;
		
	@ManyToOne
	@JoinColumn(name="BLOCK_ID")
	private BlockDetailsPersistence blockDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="SSA_ID")
	private SsaDetailsPersistence ssaDetailsPersistence;

	public Integer getQueueId() {
		return queueId;
	}

	public void setQueueId(Integer queueId) {
		this.queueId = queueId;
	}

	public String getQueueCode() {
		return queueCode;
	}

	public void setQueueCode(String queueCode) {
		this.queueCode = queueCode;
	}

	public String getQueueDesc() {
		return queueDesc;
	}

	public void setQueueDesc(String queueDesc) {
		this.queueDesc = queueDesc;
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

}
