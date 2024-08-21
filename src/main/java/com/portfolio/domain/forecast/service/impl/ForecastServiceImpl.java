package com.portfolio.domain.forecast.service.impl;

import java.util.Date;
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
//TODO	予想出庫数は、予想明細の日付ごとに最後の値を取得する（今は明細ごとでないため精度が低い）
	@Override
	public List<ForecastCalendar> generateForecastCalendar(Date forecastPeriodStart, Date forecastPeriodEnd) {
		
		return forecastMapper.generateForecastCalendar(forecastPeriodStart, forecastPeriodEnd);
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
