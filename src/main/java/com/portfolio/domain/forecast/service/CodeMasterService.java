package com.portfolio.domain.forecast.service;

import java.util.List;

import com.portfolio.domain.forecast.model.CodeMaster;

public interface CodeMasterService {
	
	/** 期間データ取得 */
	public List<CodeMaster> getCodeMasterByGroupCode(String groupCode);
	
//TODO 不要分は削除	
//
//	/** ユーザー１件取得 */
//	public User getOneUser(Integer id);
//
//	/** ユーザー１件取得（ユーザー名から） */
//	public User getOneUserByUser(String user);
	
	/** ログインユーザー情報取得 */
//	public User getLoginUser(String user);
}
