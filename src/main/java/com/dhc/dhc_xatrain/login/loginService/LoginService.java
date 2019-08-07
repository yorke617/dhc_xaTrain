package com.dhc.dhc_xatrain.login.loginService;

import com.dhc.dhc_xatrain.login.LoginForm;

/**
 * 登录检证业务
 */
public interface LoginService {

    /**
     * 登录验证方法
     * @param form
     * @return
     */
    public boolean login(LoginForm form) throws Exception;

}
