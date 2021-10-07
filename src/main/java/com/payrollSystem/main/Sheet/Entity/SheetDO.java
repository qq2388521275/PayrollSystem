package com.payrollSystem.main.Sheet.Entity;


import lombok.Data;

import java.sql.Date;

@Data
public class SheetDO{
    /**
     * 主键
     */
    private int aid;

    /**
     * 员工编号
     */
    private String eid;

    /**
     * 员工姓名
     */
    private String ename;

    /**
     * 日期
     */
    private Date date;

    /**
     * 星期
     */
    private String weekday;

    /**
     * 上班时间
     */
    private String workstart;

    /**
     * 下班时间
     */
    private String workend;

    /**
     * 工作小时数
     */
    private int worktime;

    /**
     * 加班时间
     */
    private int exworktime;

    /**
     * 是否休假
     */
    private int vacation;

    /**
     * 是否事假
     */
    private int personal_leave;

    /**
     * 是否病假
     */
    private int illness_leave;

    /**
     * 员工确认
     */
    private int commit;




}
