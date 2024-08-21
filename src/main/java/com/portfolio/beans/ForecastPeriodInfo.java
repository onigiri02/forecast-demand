package com.portfolio.beans;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ForecastPeriodInfo {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date forecastPeriodStart;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date forecastPeriodEnd;

}
	
