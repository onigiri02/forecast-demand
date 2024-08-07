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
    private Short studentsEnrolled;
    private Double attendanceRate;
    private Short issuedQuantities;
    private Short stockQuantities;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
