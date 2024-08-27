package com.portfolio.form;

import java.util.Date;

import lombok.Data;

@Data
public class ForecastCalendarForm {
    private Date calendarDate;
    private Double highestTemperature;
    private Integer studentsEnrolled;
    private Double attendanceRate;
    private Integer issuedQuantities;
    private Integer stockQuantities;
   //TODO Quantities（複数形）に直す（テーブル定義も）
    private Integer orderedQuantity;
	private Integer forecastIssueQuantities;
    private Integer temporaryStockQuantities;
}

