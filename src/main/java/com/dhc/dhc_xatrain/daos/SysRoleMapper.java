package com.dhc.dhc_xatrain.daos;

import com.dhc.dhc_xatrain.mapper.SysRole;
import java.util.List;

public interface SysRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    int insert(SysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    List<SysRole> selectAll();
}