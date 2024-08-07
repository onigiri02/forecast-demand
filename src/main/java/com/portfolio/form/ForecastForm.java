package com.portfolio.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.portfolio.annotation.PeriodCheck;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@PeriodCheck(groups = ValidGroup2.class)
public class ForecastForm {

	@NotNull(groups = ValidGroup1.class)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date forecastPeriodStart;

	@NotNull(groups = ValidGroup1.class)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date forecastPeriodEnd;

}
	
