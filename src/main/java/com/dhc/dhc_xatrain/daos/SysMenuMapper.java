package com.dhc.dhc_xatrain.daos;

import com.dhc.dhc_xatrain.mapper.SysMenu;
import java.util.List;

public interface SysMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    int insert(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    List<SysMenu> selectAll();

    /**
     *
     * @param userId
     * @return
     */
    List<SysMenu> selectMenusByUser(long userId);
}