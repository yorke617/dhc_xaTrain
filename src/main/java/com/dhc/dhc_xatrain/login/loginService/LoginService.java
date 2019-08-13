package com.dhc.dhc_xatrain.login.loginService;

import com.dhc.dhc_xatrain.login.LoginForm;
import com.dhc.dhc_xatrain.login.Menus;
import com.dhc.dhc_xatrain.mapper.SysMenu;

import java.util.List;

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

    /**
     * 获取加密因子
     * @return
     */
    public String getCryptoKey();

    /**
     * 注册用户
     * @param form
     */
    public void register(LoginForm form);

    /**
     * 获取相应的功能菜单
     * @param userId
     * @return
     */
    public List<SysMenu> getMenus(long userId);

}
