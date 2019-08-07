package com.dhc.dhc_xatrain.mapper;

import java.util.Date;

public class SysRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_name
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.dept_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private Long deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.type
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_time
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.remark
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_id
     *
     * @return the value of sys_role.role_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_id
     *
     * @param roleId the value for sys_role.role_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_name
     *
     * @return the value of sys_role.role_name
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_name
     *
     * @param roleName the value for sys_role.role_name
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.dept_id
     *
     * @return the value of sys_role.dept_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.dept_id
     *
     * @param deptId the value for sys_role.dept_id
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.type
     *
     * @return the value of sys_role.type
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.type
     *
     * @param type the value for sys_role.type
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_time
     *
     * @return the value of sys_role.create_time
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_time
     *
     * @param createTime the value for sys_role.create_time
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.remark
     *
     * @return the value of sys_role.remark
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.remark
     *
     * @param remark the value for sys_role.remark
     *
     * @mbggenerated Wed Aug 07 11:36:21 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}