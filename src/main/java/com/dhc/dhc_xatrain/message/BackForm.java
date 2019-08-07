package com.dhc.dhc_xatrain.message;

public class BackForm {
    private int status;
    private boolean isSuccess;
    private String message;
    private ReturnMsg returnMsg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ReturnMsg getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(ReturnMsg returnMsg) {
        this.returnMsg = returnMsg;
    }
}
