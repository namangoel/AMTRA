package com.accenture.amtra.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="STRATEGY_DETAIL")
public class StrategyDetailPesistence {

	@Id
	@Column(name="STRATEGY_ID")
	private Integer strategyId;
	
	@Column(name="STRATEGY_NAME")
	private String strategyName;
	
	@Column(name="STRATEGY_DESC")
	private String strategyDesc;

	public Integer getStrategyId() {
		return strategyId;
	}

	public void setStrategyId(Integer strategyId) {
		this.strategyId = strategyId;
	}

	public String getStrategyName() {
		return strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}

	public String getStrategyDesc() {
		return strategyDesc;
	}

	public void setStrategyDesc(String strategyDesc) {
		this.strategyDesc = strategyDesc;
	}

}
