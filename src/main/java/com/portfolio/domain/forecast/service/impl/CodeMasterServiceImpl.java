package com.portfolio.domain.forecast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.domain.forecast.model.CodeMaster;
import com.portfolio.domain.forecast.service.CodeMasterService;
import com.portfolio.repository.CodeMasterMapper;

@Service
public class CodeMasterServiceImpl implements CodeMasterService {

	@Autowired
	private CodeMasterMapper codeMasterMapper;

	@Override
	public List<CodeMaster> getCodeMasterByGroupCode(String groupCode) {
		
		return codeMasterMapper.findByGroupCode(groupCode);
	}
}
