package com.dhc.dhc_xatrain.daos;

import com.dhc.dhc_xatrain.mapper.SysRoleMenu;
import java.util.List;

public interface SysRoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    int insert(SysRoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_menu
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    List<SysRoleMenu> selectAll();
}