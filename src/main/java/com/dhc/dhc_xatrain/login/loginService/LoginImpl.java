package com.dhc.dhc_xatrain.login.loginService;

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
        SysUser sysUser = sysUserMapper.queryUserByName(form.getUsername());
        if (sysUser == null){
            throw new Exception("该用户不存在！");
        }
        if (!sysUser.getPassword().equals(form.getPassword())){
            throw new Exception("该用户密码不正确！");
        }
        form.setUserId(sysUser.getUserId());
        return true;
    }
}
