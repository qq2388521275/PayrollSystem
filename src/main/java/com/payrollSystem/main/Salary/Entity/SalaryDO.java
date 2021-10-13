package com.payrollSystem.main.Salary.Entity;


import lombok.Data;

import java.sql.Date;

@Data
public class SalaryDO {
    /**
     * eid
     */
    private String eid;

    /**
     * 起始时间
     */
    private Date beginTime;

    /**
     * 终止时间
     */
    private Date endTime;

}
