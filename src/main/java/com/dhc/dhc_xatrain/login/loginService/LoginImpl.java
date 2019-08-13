package com.dhc.dhc_xatrain.login.loginService;

import com.dhc.dhc_xatrain.Utils.EncryptUtil;
import com.dhc.dhc_xatrain.Utils.WebUtil;
import com.dhc.dhc_xatrain.businessException.BusinessException;
import com.dhc.dhc_xatrain.constant.Constant;
import com.dhc.dhc_xatrain.daos.SysMenuMapper;
import com.dhc.dhc_xatrain.daos.SysUserMapper;
import com.dhc.dhc_xatrain.daos.SysUserRoleMapper;
import com.dhc.dhc_xatrain.login.LoginForm;
import com.dhc.dhc_xatrain.login.Menus;
import com.dhc.dhc_xatrain.mapper.SysMenu;
import com.dhc.dhc_xatrain.mapper.SysUser;
import com.dhc.dhc_xatrain.mapper.SysUserRole;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@Transactional
public class LoginImpl implements LoginService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    private SysMenuMapper sysMenuMapper;

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
        password = WebUtil.EncoderByMd5(password + sysUser.getSalt());
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
        if (form == null)
            throw new BusinessException("注册信息为空，" + Constant.BusinessMsg.COMMENTS);
        if (Strings.isEmpty(form.getReUserName()))
            throw new BusinessException("注册用户名为空，请检查！");
        if (StringUtils.isEmpty(form.getConfirmRePassword())){
            throw new BusinessException("注册密码为空，请检查或联系管理员！");
        }
        if (form.getRePassword() == null || "".equals(form.getRePassword())) {
            throw new BusinessException("注册密码为空，请检查！");
        }
        if (!form.getRePassword().equals(form.getConfirmRePassword())){
            throw new BusinessException("注册密码与确认密码不一致，请检查！");
        }
        //检验用户名是否重复
        SysUser sysUser = sysUserMapper.queryUserByName(form.getReUserName());
        if (sysUser != null){
            throw new BusinessException("该用户名已存在！");
        }
        //。。。
    }

    /**
     * 写登录信息
     * @param form
     */
    private void writeLoginInfo(LoginForm form) {
        SysUser sysUser = new SysUser();
        sysUser.setUserName(form.getReUserName());
        String salt = EncryptUtil.getRandomCode();
        sysUser.setPassword(WebUtil.EncoderByMd5(form.getRePassword() + salt));
        sysUser.setSalt(salt);
        sysUser.setIp(form.getLoginIp());
        sysUser.setEmail(form.getReMail());
        sysUser.setMobile(form.getPhone());
//        sysUser.setDeptId(form.getDepartment());
        sysUser.setState("10");
        sysUser.setLockStatus("10");
        sysUser.setErrorTimes(0);
        int record = sysUserMapper.insert(sysUser);
        if (record != 1){
            throw new BusinessException("注册信息保存出错！");
        }
        form.setUserId(sysUser.getUserId());
    }

    /**
     * 设置默认角色
     * @param form
     */
    private void setDefaultRole(LoginForm form) {
        SysUserRole sysUserRole = new SysUserRole();
        sysUserRole.setRoleId(2l);
        sysUserRole.setUserId(form.getUserId());
        int record = sysUserRoleMapper.insert(sysUserRole);
        if (record != 1){
            throw new BusinessException("注册用户角色信息保存出错！");
        }
//        int a = 1/0;
    }

    @Override
    public List<SysMenu> getMenus(long userId) {
        if (userId == 0){
            throw new BusinessException("获取功能菜单信息为空！");
        }
        List<SysMenu> sysMenus = sysMenuMapper.selectMenusByUser(userId);
        if (sysMenus == null){
            throw new BusinessException("该人员没有相应的功能！");
        }

        return sysMenus;
    }
}
