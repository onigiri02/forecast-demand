package com.portfolio.domain.forecast.model;

import java.util.Date;

import lombok.Data;

@Data
public class Forecast {
    private Integer id;
    private Integer forecastId;
    private Date forecastTargetDate;
    private String weather;
    private Double highestTemperature;
    private Integer studentsEnrolled;
    private Double attendanceRate;
    private Integer issueQuantities;
}
