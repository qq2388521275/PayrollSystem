package com.payrollSystem.main.Sheet.Entity;


import lombok.Data;

@Data
public class SheetVO {
    /**
     * 考勤卡主键
     */
    private int aid;

    /**
     * 上班时间
     */
    private String workstart;

    /**
     * 下班时间
     */
    private String workend;

    /**
     * 星期
     */
    private int weekday;

    /**
     * 状态
     */
    private int commit;



}
