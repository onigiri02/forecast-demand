package com.portfolio.domain.forecast.model;

import lombok.Data;

@Data
public class CodeMaster {
    private Integer id;
    private String groupCode;
    private String code;
    private String groupCodeName;
    private String codeName;
    private String sortKey;
}
