package com.dhc.dhc_xatrain.businessException;

public class BusinessException extends RuntimeException {

    private int status;
    private String message;

    public BusinessException() {
        this.status = 999;
        this.message = "系统错误，请联系系统管理员！";
    }
    public BusinessException(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public BusinessException(String message) {
        this.status = 999;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
