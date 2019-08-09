package com.dhc.dhc_xatrain.businessException;

import com.dhc.dhc_xatrain.BaseController;
import com.dhc.dhc_xatrain.message.BackForm;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class DHCExceptionHandler extends BaseController {

    @ExceptionHandler(BusinessException.class)
    public BackForm ExceptionHandle(HttpServletRequest request, BusinessException e){
        return setError(e.getStatus(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public BackForm ExceptionHandle1(HttpServletRequest request, Exception e){
        return setError();
    }
}
