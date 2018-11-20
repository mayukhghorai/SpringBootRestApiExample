package com.websystique.springboot.util;

/**
 * Created by Ext-MayukhG on 7/4/2018.
 */
public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
