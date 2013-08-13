package com.accenture.amtra.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="TEST_RESULT_DETAILS")
public class TestResultDetailsPersistence {

	@Id
	@Column(name="TEST_RESULT_STATUS_ID")
	private Integer testResultStatusId;
	
	@Column(name="UPLOADED_LINK")
	private String uploadedLink;
	
	@Column(name="UPLOADED_DATE")
	private Date uploadedDate;
	
	@Column(name="TESTED_ENV_DETAIL")
	private String testedEnvDetail;
	
	@ManyToOne
	@JoinColumn(name="SSA_ID")
	private SsaDetailsPersistence ssaDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="MTP_ID")
	private MtpDetailsPersistence mtpDetailsPersistence;
	
	@ManyToOne
	@JoinColumn(name="TICKET_ID")
	private TicketDetailsPersistence ticketDetailsPersistence;


	public Integer getTestResultStatusId() {
		return testResultStatusId;
	}

	public void setTestResultStatusId(Integer testResultStatusId) {
		this.testResultStatusId = testResultStatusId;
	}

	public String getUploadedLink() {
		return uploadedLink;
	}

	public void setUploadedLink(String uploadedLink) {
		this.uploadedLink = uploadedLink;
	}

	public Date getUploadedDate() {
		return uploadedDate;
	}

	public void setUploadedDate(Date uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

	public String getTestedEnvDetail() {
		return testedEnvDetail;
	}

	public void setTestedEnvDetail(String testedEnvDetail) {
		this.testedEnvDetail = testedEnvDetail;
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

	public TicketDetailsPersistence getTicketDetailsPersistence() {
		return ticketDetailsPersistence;
	}

	public void setTicketDetailsPersistence(
			TicketDetailsPersistence ticketDetailsPersistence) {
		this.ticketDetailsPersistence = ticketDetailsPersistence;
	}

}
