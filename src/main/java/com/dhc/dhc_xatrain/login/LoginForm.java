package com.dhc.dhc_xatrain.login;

import com.dhc.dhc_xatrain.mapper.SysMenu;
import com.dhc.dhc_xatrain.message.ReturnMsg;

import java.io.Serializable;
import java.util.List;

public class LoginForm extends ReturnMsg implements Serializable {
    private String username;
    private String password;
    private String cryptoKey;

    //注册信息
    private String reUserName;
    private String rePassword;
    private String confirmRePassword;
    private String reMail;
    private String phone;
    private String department;
    private String loginIp;

    //菜单列表
//    private List<Menus> menusList;
    private List<SysMenu> menusList;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCryptoKey() {
        return cryptoKey;
    }

    public void setCryptoKey(String cryptoKey) {
        this.cryptoKey = cryptoKey;
    }

    public String getReUserName() {
        return reUserName;
    }

    public void setReUserName(String reUserName) {
        this.reUserName = reUserName;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getConfirmRePassword() {
        return confirmRePassword;
    }

    public void setConfirmRePassword(String confirmRePassword) {
        this.confirmRePassword = confirmRePassword;
    }

    public String getReMail() {
        return reMail;
    }

    public void setReMail(String reMail) {
        this.reMail = reMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public List<SysMenu> getMenusList() {
        return menusList;
    }

    public void setMenusList(List<SysMenu> menusList) {
        this.menusList = menusList;
    }
}
