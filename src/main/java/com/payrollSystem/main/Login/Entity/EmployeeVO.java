package com.payrollSystem.main.Login.Entity;


import lombok.Data;

@Data
public class EmployeeVO {
    /**
     * 主键
     */
    private String eid;

    /**
     * 员工类型
     */
    private String paytype;

    /**
     * 付款方式
     */
    private String salaryway;

    /**
     * 员工姓名
     */
    private String ename;

    /**
     * 员工性别
     */
    private String esex;

    /**
     * 职务
     */
    private String eposition;

    /**
     * 部门
     */
    private String department;

    /**
     * tel
     */
    private String phonenumber;

    /**
     * email
     */
    private String email;

    /**
     * 标准税收减免
     */
    private int tex_remisstion;

    /**
     * 工资
     */
    private int salary;

    /**
     * 佣金率
     */
    private float salaryrate;

    /**
     * 小时薪资
     */
    private int hoursalary;

    /**
     * 工时限制
     */
    private int timelimit;

    /**
     * 年假
     */
    private int vacation_day;

    /**
     * 密码
     */
    private String password;
}
