package com.example.employee_payroll_deployment.Response;

import org.springframework.stereotype.Component;

@Component
public class Response {
    private String responseMessage;
    private Integer responseStatus;
    private Object responseData;

    public Response() {
    }

    public Response(String responseMessage, Integer responseStatus, Object responseData) {
        this.responseMessage = responseMessage;
        this.responseStatus = responseStatus;
        this.responseData = responseData;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Integer getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Object getResponseData() {
        return responseData;
    }

    public void setResponseData(Object responseData) {
        this.responseData = responseData;
    }
}
