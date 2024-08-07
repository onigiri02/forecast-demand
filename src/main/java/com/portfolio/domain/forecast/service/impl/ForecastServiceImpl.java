package com.portfolio.domain.forecast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.domain.forecast.model.ForecastCalendar;
import com.portfolio.domain.forecast.service.ForecastService;
import com.portfolio.repository.ForecastMapper;

@Service
public class ForecastServiceImpl implements ForecastService {

	@Autowired
	private ForecastMapper forecastMapper;

	/** 需要予測用のカレンダーを作成する */
	@Override
	public List<ForecastCalendar> generateForecastCalendar() {
		
		return forecastMapper.generateForecastCalendar();
	}
	
//TODO 不要分は削除	
//	/** ユーザー１件取得 */
//	@Override
//	public User getOneUser(Integer id) {
//		
//		return userMapper.findOne(id);
//	}
//	
//	/** ユーザー１件取得（ユーザー名から） */
//	@Override
//	public User getOneUserByUser(String user) {
//
//		return userMapper.findOneByUser(user);
//	}
//	
	
	/** ログインユーザー情報取得 */
//	@Override
//	public User getLoginUser(String user) {
		
//		return userMapper.findLoginUser(user);
//	}

}
