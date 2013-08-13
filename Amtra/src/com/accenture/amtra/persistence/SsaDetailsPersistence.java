package com.accenture.amtra.persistence;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name="SSA_DETAILS")
public class SsaDetailsPersistence {
	
	@Id
	@Column(name="SSA_ID")
	private Integer ssaId;
	
	@Column(name="SSA_NAME")
	private String ssaName;
	
	@Column(name="SSA_CODE")
	private String ssaCode;
	
	@Column(name="DOMAIN")
	private String domain;
	
	@ManyToOne
	@JoinColumn(name="BLOCK_ID")
	private BlockDetailsPersistence blockDetails;
	
	@ManyToOne
	@JoinColumn(name="SSA_STRATEGY")
	private StrategyDetailPesistence strategyDetailPesistence;
	
/*	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="USER_SSA_ASSOCIATION", 
		joinColumns = {@JoinColumn(name="SSA_ID", referencedColumnName="SSA_ID")},
		inverseJoinColumns = {@JoinColumn(name="EMPLOYEE_ID", referencedColumnName="EMPLOYEE_ID")}
	)
	private Set<UserDetailsPersistence> userSsaDetailsSet;*/
	
	@ManyToMany(mappedBy="userSsaDetailsSet")
	private Set<UserDetailsPersistence> userSsaDetailsSet;

	public Integer getSsaId() {
		return ssaId;
	}

	public void setSsaId(Integer ssaId) {
		this.ssaId = ssaId;
	}

	public String getSsaName() {
		return ssaName;
	}

	public void setSsaName(String ssaName) {
		this.ssaName = ssaName;
	}

	public String getSsaCode() {
		return ssaCode;
	}

	public void setSsaCode(String ssaCode) {
		this.ssaCode = ssaCode;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public BlockDetailsPersistence getBlockDetails() {
		return blockDetails;
	}

	public void setBlockDetails(BlockDetailsPersistence blockDetails) {
		this.blockDetails = blockDetails;
	}

	public StrategyDetailPesistence getStrategyDetailPesistence() {
		return strategyDetailPesistence;
	}

	public void setStrategyDetailPesistence(
			StrategyDetailPesistence strategyDetailPesistence) {
		this.strategyDetailPesistence = strategyDetailPesistence;
	}

	public Set<UserDetailsPersistence> getUserSsaDetailsSet() {
		return userSsaDetailsSet;
	}

	public void setUserSsaDetailsSet(Set<UserDetailsPersistence> userSsaDetailsSet) {
		this.userSsaDetailsSet = userSsaDetailsSet;
	}


}
