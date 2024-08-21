package com.portfolio.domain.forecast.model;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

@Data
public class Results {
    private Integer id;
    private Date targetDate;
    private String weather;
    private Double highestTemperature;
    private Integer studentsEnrolled;
    private Double attendanceRate;
    private Integer issuedQuantities;
    private Integer stockQuantities;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
