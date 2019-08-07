package com.dhc.dhc_xatrain.daos;

import com.dhc.dhc_xatrain.mapper.SysUser;
import java.util.List;

public interface SysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    int insert(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    List<SysUser> selectAll();

    /**
     * 根据用户名查询用户信息
     * @param userId
     * @return
     */
    SysUser queryUserByName(String userName);
}