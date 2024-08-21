package com.portfolio.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.portfolio.domain.forecast.model.ForecastCalendar;

@Mapper
public interface ForecastMapper {

	/** ユーザー取得（全件） */
	public List<ForecastCalendar> generateForecastCalendar(Date forecastPeriodStart, Date forecastPeriodEnd);

//TODO 不要分は削除
//	/** ユーザー取得（１件） */
//	public User findOne(Integer id);
//
//	/** ユーザー取得（１件） */
//	public User findOneByUser(String user);
	
	/** ログインユーザー取得 */
//	public User findLoginUser(String user);
}
