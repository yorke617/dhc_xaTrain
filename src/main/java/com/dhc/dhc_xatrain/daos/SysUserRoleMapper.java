package com.dhc.dhc_xatrain.daos;

import com.dhc.dhc_xatrain.mapper.SysUserRole;
import java.util.List;

public interface SysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    int insert(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    List<SysUserRole> selectAll();
}