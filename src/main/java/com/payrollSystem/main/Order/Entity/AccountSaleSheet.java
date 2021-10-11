package com.payrollSystem.main.Order.Entity;


import lombok.Data;

import java.sql.Date;

@Data
public class AccountSaleSheet {
    /**
     * 主键
     */
    private int aid;

    /**
     * 销售员姓名
     */
    private String ename;

    /**
     * 销售员编号
     */
    private String eid;

    /**
     * 日期
     */
    private Date date;

    /**
     * 产品名称
     */
    private String pname;

    /**
     * 规格型号
     */
    private String ptype;

    /**
     * 单价
     */
    private int price;

    /**
     * 数量
     */
    private int number;

    /**
     * 金额
     */
    private int account;

    /**
     * 客户联系方式
     */
    private String client_phone;

    /**
     * 客户账单地址
     */
    private String client_address;

    /**
     * 状态
     */
    private int status;


}
