package com.dhc.dhc_xatrain.daos;

import com.dhc.dhc_xatrain.mapper.SysLoginLog;
import java.util.List;

public interface SysLoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    int insert(SysLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    List<SysLoginLog> selectAll();
}