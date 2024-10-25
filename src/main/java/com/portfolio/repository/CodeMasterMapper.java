package com.portfolio.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.portfolio.domain.forecast.model.CodeMaster;

@Mapper
public interface CodeMasterMapper {

	/** コード取得 */
	public List<CodeMaster> findByGroupCode(String groupCode);

}
