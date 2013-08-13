package com.accenture.amtra.persistence;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="BLOCK_DETAILS")
public class BlockDetailsPersistence {
	
	@Id
	@Column(name="BLOCK_ID")
	private Integer blockId;
	
	@Column(name="BLOCK_NAME")
	private String blockName;
	
	@Column(name="BLOCK_DESC")
	private String blockDesc;
	
	/*@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="USER_BLOCK_ASSOCIATION", 
		joinColumns = {@JoinColumn(name="BLOCK_ID", referencedColumnName="BLOCK_ID")},
		inverseJoinColumns = {@JoinColumn(name="EMPLOYEE_ID", referencedColumnName="EMPLOYEE_ID")}
	)
	private Set<UserDetailsPersistence> userBlockDetailsSet;*/
	@ManyToMany(mappedBy="userBlockDetailsSet")
	private Set<UserDetailsPersistence> userBlockDetailsSet;

	
	public Integer getBlockId() {
		return blockId;
	}
	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public String getBlockDesc() {
		return blockDesc;
	}
	public void setBlockDesc(String blockDesc) {
		this.blockDesc = blockDesc;
	}
	public Set<UserDetailsPersistence> getUserBlockDetailsSet() {
		return userBlockDetailsSet;
	}
	public void setUserBlockDetailsSet(
			Set<UserDetailsPersistence> userBlockDetailsSet) {
		this.userBlockDetailsSet = userBlockDetailsSet;
	}

}
