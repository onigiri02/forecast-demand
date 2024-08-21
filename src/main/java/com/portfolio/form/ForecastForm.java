package com.portfolio.form;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ForecastForm {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date forecastPeriodStart;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date forecastPeriodEnd;
	
	private List<ForecastCalendarForm> forecastCalendar;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderedOn;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deliveriedOn;
	
	private Integer orderedQuantity;
}
	
