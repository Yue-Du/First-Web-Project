package com.yue.first.bean;

import java.util.ArrayList;
import java.util.Collections;

public class WebResponse<ValueType> {
    private ValueType value;
    private int status;
    private String message;

    public static WebResponse createResponse() {
        WebResponse webResponse = new WebResponse();
        return webResponse;
    }

    public WebResponse success() {
        this.status = 0;
        this.message = "SUCCESS";
        return this;
    }

    public WebResponse failed() {
        this.status = 1;
        this.message = "FAILED";
        return this;
    }

    public WebResponse value(ValueType val) {
        this.value = val;
        return this;
    }

    public ValueType getValue() {
        return value;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "WebResponse{" +
                "value=" + value +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }

}
