package com.dhc.dhc_xatrain.mapper;

import java.util.Date;

public class SysUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_name
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.salt
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.last_login_time
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.IP
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.email
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.mobile
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.dept_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private Long deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_time
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.state
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.lock_status
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String lockStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.error_times
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private Integer errorTimes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_id
     *
     * @return the value of sys_user.user_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_id
     *
     * @param userId the value for sys_user.user_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_name
     *
     * @return the value of sys_user.user_name
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_name
     *
     * @param userName the value for sys_user.user_name
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.salt
     *
     * @return the value of sys_user.salt
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.salt
     *
     * @param salt the value for sys_user.salt
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.last_login_time
     *
     * @return the value of sys_user.last_login_time
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.last_login_time
     *
     * @param lastLoginTime the value for sys_user.last_login_time
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.IP
     *
     * @return the value of sys_user.IP
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.IP
     *
     * @param ip the value for sys_user.IP
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.email
     *
     * @return the value of sys_user.email
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.email
     *
     * @param email the value for sys_user.email
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.mobile
     *
     * @return the value of sys_user.mobile
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.mobile
     *
     * @param mobile the value for sys_user.mobile
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.dept_id
     *
     * @return the value of sys_user.dept_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.dept_id
     *
     * @param deptId the value for sys_user.dept_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_time
     *
     * @return the value of sys_user.create_time
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_time
     *
     * @param createTime the value for sys_user.create_time
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.state
     *
     * @return the value of sys_user.state
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.state
     *
     * @param state the value for sys_user.state
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.lock_status
     *
     * @return the value of sys_user.lock_status
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getLockStatus() {
        return lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.lock_status
     *
     * @param lockStatus the value for sys_user.lock_status
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.error_times
     *
     * @return the value of sys_user.error_times
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public Integer getErrorTimes() {
        return errorTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.error_times
     *
     * @param errorTimes the value for sys_user.error_times
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setErrorTimes(Integer errorTimes) {
        this.errorTimes = errorTimes;
    }
}