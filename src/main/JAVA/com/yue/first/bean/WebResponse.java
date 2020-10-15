package com.yue.first.bean;

public class WebResponse<ValueType> {
    private ValueType value;
    private int status;
    private String message;

    public static WebResponse createResponse(){
        WebResponse webResponse = new WebResponse();
        return webResponse;
    }

    public WebResponse success(){
        this.status = 0;
        this.message = "SUCCESS";
        return this;
    }

    public WebResponse failed(){
        this.status = 1;
        this.message = "FAILED";
        return this;
    }

    public WebResponse value(ValueType val){
        this.value = val;
        return this;
    }

}
