package com.portfolio.validation;

import java.util.Calendar;

import com.portfolio.annotation.PeriodCheck;
import com.portfolio.form.ForecastPeriodForm;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PeriodCheckValidation implements ConstraintValidator<PeriodCheck, ForecastPeriodForm>{
	
  @Override
  public boolean isValid(ForecastPeriodForm value, ConstraintValidatorContext context) {
	  
    if (value.getForecastPeriodStart() == null || value.getForecastPeriodEnd() == null) {
      return false;
    }
    
    if (value.getForecastPeriodStart().after(value.getForecastPeriodEnd())) {
        return false;
      }

    
    if (value.getForecastPeriodStart().equals(value.getForecastPeriodEnd())) {
        return false;
      }
    
	// 期間が3週間超であればfalse、それ以外はtrueを返す
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(value.getForecastPeriodStart());
	calendar.add(Calendar.DAY_OF_MONTH, 21);

	return calendar.getTime().before(value.getForecastPeriodEnd()) ? false : true;
		
  }
  
}
