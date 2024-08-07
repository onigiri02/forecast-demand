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
    private Short studentsEnrolled;
    private Double attendanceRate;
    private Short issueQuantities;
}
