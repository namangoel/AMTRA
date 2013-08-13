package com.accenture.amtra.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="DTC_PEV_DETAILS")
public class DtcPevDetailsPersistence {
	
	@Id
	@Column(name="DTC_PEV_ID")
	private Integer DtcPevId;
	
	@Column(name="DTC_PEV_NAME")
	private String dtcPevName;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@Column(name="DTC_PEV_DESC")
	private String dtcPevDesc;
	
	@ManyToOne
	@JoinColumn(name="SSA_ID")
	private SsaDetailsPersistence ssaDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="MTP_ID")
	private MtpDetailsPersistence mtpDetailsPersistence;

	public Integer getDtcPevId() {
		return DtcPevId;
	}

	public void setDtcPevId(Integer dtcPevId) {
		DtcPevId = dtcPevId;
	}

	public String getDtcPevName() {
		return dtcPevName;
	}

	public void setDtcPevName(String dtcPevName) {
		this.dtcPevName = dtcPevName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDtcPevDesc() {
		return dtcPevDesc;
	}

	public void setDtcPevDesc(String dtcPevDesc) {
		this.dtcPevDesc = dtcPevDesc;
	}

	public SsaDetailsPersistence getSsaDetailsPersistence() {
		return ssaDetailsPersistence;
	}

	public void setSsaDetailsPersistence(SsaDetailsPersistence ssaDetailsPersistence) {
		this.ssaDetailsPersistence = ssaDetailsPersistence;
	}

	public MtpDetailsPersistence getMtpDetailsPersistence() {
		return mtpDetailsPersistence;
	}

	public void setMtpDetailsPersistence(MtpDetailsPersistence mtpDetailsPersistence) {
		this.mtpDetailsPersistence = mtpDetailsPersistence;
	}

}
