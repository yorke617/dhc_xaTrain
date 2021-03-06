package com.dhc.dhc_xatrain;

import com.dhc.dhc_xatrain.message.BackForm;
import com.dhc.dhc_xatrain.message.ReturnMsg;

public class BaseController {

    public BackForm setSuccessful(ReturnMsg returnMsg){
        BackForm backForm = new BackForm();
        backForm.setStatus(0);
        backForm.setSuccess(true);
        backForm.setReturnMsg(returnMsg);
        return backForm;
    }
    public BackForm setSuccessful(){
        BackForm backForm = new BackForm();
        backForm.setStatus(0);
        backForm.setSuccess(true);
        backForm.setReturnMsg(null);
        return backForm;
    }
    public BackForm setError(){
        BackForm backForm = new BackForm();
        backForm.setStatus(999);
        backForm.setSuccess(false);
        backForm.setReturnMsg(null);
        backForm.setMessage("系统异常，请联系系统管理员！");
        return backForm;
    }
    public BackForm setError(String message){
        BackForm backForm = new BackForm();
        backForm.setStatus(999);
        backForm.setSuccess(false);
        backForm.setReturnMsg(null);
        backForm.setMessage(message);
        return backForm;
    }
    public BackForm setError(int status, String message){
        BackForm backForm = new BackForm();
        backForm.setStatus(status);
        backForm.setSuccess(false);
        backForm.setReturnMsg(null);
        backForm.setMessage(message);
        return backForm;
    }

}
