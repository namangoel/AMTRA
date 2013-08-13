package com.accenture.amtra.dao;

import java.util.List;

import com.accenture.amtra.persistence.BlockDetailsPersistence;

public interface BlockDetailsDAO {
	BlockDetailsPersistence getBlockDetail(Integer id);
	void saveOrUpdate(BlockDetailsPersistence blockDetailsPersistence);
	List<BlockDetailsPersistence> getAllBlockDetails();
}
