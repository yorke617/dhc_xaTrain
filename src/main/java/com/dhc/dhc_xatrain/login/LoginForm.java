package com.dhc.dhc_xatrain.login;

import com.dhc.dhc_xatrain.message.ReturnMsg;

public class LoginForm extends ReturnMsg {
    private String username;
    private String password;
    private String cryptoKey;

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
}
