package com.portfolio.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.portfolio.validation.PeriodCheckValidation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = PeriodCheckValidation.class)
@Target(ElementType.TYPE) //(2)
@Retention(RetentionPolicy.RUNTIME)
public @interface PeriodCheck {
	  String message() default "終了日は開始日から3週間以内で指定してください";

	  Class<?>[] groups() default {};

	  Class<? extends Payload>[] payload() default {};
}
