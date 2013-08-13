package com.accenture.amtra.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="MTP_DETAILS")
public class MtpDetailsPersistence {
	
	@Id
	@Column(name="MTP_ID")
	private Integer mtpId;
	
	@Column(name="MTP_DATE")
	private Date mtpDate;
	
	@Column(name="ITEM_NUMBER")
	private String itemNumber;
	
	@ManyToOne
	@JoinColumn(name="BLOCK_ID")
	private BlockDetailsPersistence blockDetails;
	
	@ManyToOne
	@JoinColumn(name="SSA_ID")
	private SsaDetailsPersistence ssaDetailsPersistence;

	public Integer getMtpId() {
		return mtpId;
	}

	public void setMtpId(Integer mtpId) {
		this.mtpId = mtpId;
	}

	public Date getMtpDate() {
		return mtpDate;
	}

	public void setMtpDate(Date mtpDate) {
		this.mtpDate = mtpDate;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public BlockDetailsPersistence getBlockDetails() {
		return blockDetails;
	}

	public void setBlockDetails(BlockDetailsPersistence blockDetails) {
		this.blockDetails = blockDetails;
	}

	public SsaDetailsPersistence getSsaDetailsPersistence() {
		return ssaDetailsPersistence;
	}

	public void setSsaDetailsPersistence(SsaDetailsPersistence ssaDetailsPersistence) {
		this.ssaDetailsPersistence = ssaDetailsPersistence;
	}


}
