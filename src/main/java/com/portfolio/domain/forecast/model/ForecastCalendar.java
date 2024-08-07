package com.portfolio.domain.forecast.model;

import java.util.Date;

import lombok.Data;

@Data
public class ForecastCalendar {
    private Date calendarDate;
    private Double highestTemperature;
    private Integer studentsEnrolled;
    private Double attendanceRate;
    private Integer issuedQuantities;
    private Integer stockQuantities;
    private Integer orderedQuantity;
}
