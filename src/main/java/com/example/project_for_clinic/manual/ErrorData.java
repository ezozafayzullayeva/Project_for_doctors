package com.example.project_for_clinic.manual;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorData {

    private String errorMsg;

    private String fieldName;

    private Integer errorCode;
    public ErrorData(String errorMsg, Integer errorCode) {
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

}