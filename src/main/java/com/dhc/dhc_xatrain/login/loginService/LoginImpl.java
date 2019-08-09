package com.dhc.dhc_xatrain.login.loginService;

import com.dhc.dhc_xatrain.Utils.EncryptUtil;
import com.dhc.dhc_xatrain.Utils.WebUtil;
import com.dhc.dhc_xatrain.businessException.BusinessException;
import com.dhc.dhc_xatrain.daos.SysUserMapper;
import com.dhc.dhc_xatrain.login.LoginForm;
import com.dhc.dhc_xatrain.mapper.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginImpl implements LoginService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public boolean login(LoginForm form) throws Exception {
        //入参验空
        if (form == null){
            throw new Exception();
        }
        if ("".equals(form.getUsername())){
            throw new Exception();
        }

        String password = form.getPassword();
        String cryptokey = form.getCryptoKey();
        password = EncryptUtil.aesDecrypt(password, cryptokey);
        System.out.println("解密后的明文：" + password);

        SysUser sysUser = sysUserMapper.queryUserByName(form.getUsername());
        password = WebUtil.EncoderByMd5(password);
        if (sysUser == null){
            throw new Exception("该用户不存在！");
        }
        if (!sysUser.getPassword().equals(password)){
            throw new Exception("该用户密码不正确！");
        }
        form.setUserId(sysUser.getUserId());
        return true;
    }

    @Override
    public String getCryptoKey() {
        return EncryptUtil.getKey();
    }

    @Override
    public void register(LoginForm form) {
        if (form == null){
            throw new BusinessException("注册信息为空，请检查！");
        }
        //检验，和前台一样
        verifyRegister(form);
        //写登录信息
        writeLoginInfo(form);
        //写默认的角色
        setDefaultRole(form);

    }

    /**
     * 校验注册信息
     * @param form
     */
    private void verifyRegister(LoginForm form) {
    }

    /**
     * 写登录信息
     * @param form
     */
    private void writeLoginInfo(LoginForm form) {
    }

    /**
     * 设置默认角色
     * @param form
     */
    private void setDefaultRole(LoginForm form) {
    }


}
