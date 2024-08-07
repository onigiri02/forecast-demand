package com.portfolio.domain.forecast.model;

import java.util.Date;

import lombok.Data;

@Data
public class Orders {
    private Integer id;
    private Date orderedOn;
    private Date deliveriedOn;
    private Short orderedQuantity;
}
