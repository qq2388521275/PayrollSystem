package com.payrollSystem.main.Order.Mappers;


import com.payrollSystem.main.Order.Entity.AccountSaleSheetVO;
import org.apache.ibatis.annotations.*;

import java.sql.Date;
import java.util.List;

@Mapper
public interface AccountSaleMapper {
    //查询全部
    @Select("select * from account_sales where status=1")
    @Results({
            @Result(property = "aid", column = "aid"),
            @Result(property = "ename", column = "ename"),
            @Result(property = "eid", column = "eid"),
            @Result(property = "date", column = "date"),
            @Result(property = "pname", column = "pname"),
            @Result(property = "ptype", column = "ptype"),
            @Result(property = "number", column = "number"),
            @Result(property = "account", column = "account"),
            @Result(property = "client_phone", column = "client_phone"),
            @Result(property = "client_address", column = "client_address"),
    })
    public List<AccountSaleSheetVO> selectAll();

    //查询筛选编号
    @Select("select * from account_sales where status=1 and eid=#{eid}")
    @Results({
            @Result(property = "aid", column = "aid"),
            @Result(property = "ename", column = "ename"),
            @Result(property = "eid", column = "eid"),
            @Result(property = "date", column = "date"),
            @Result(property = "pname", column = "pname"),
            @Result(property = "ptype", column = "ptype"),
            @Result(property = "number", column = "number"),
            @Result(property = "account", column = "account"),
            @Result(property = "client_phone", column = "client_phone"),
            @Result(property = "client_address", column = "client_address"),
    })
    public List<AccountSaleSheetVO> selectByName(String eid);

    //添加
    @Insert("Insert into account_sales(ename,eid,date,pname,ptype,price,number,account,client_phone,client_address,status) VALUES(" +
            "#{ename},#{eid},#{date},#{pname},#{ptype},#{price},#{number},#{account},#{client_phone},#{client_address},1)")

    public int addAccountSale(String ename, String eid, Date date, String pname, String ptype, int price, int number, String client_phone, String client_address, int account);

    //删除
    @Update("Update account_sales set status =0 where aid=#{aid}")
    public int deleteAccountSale(int aid);

    @Update("update account_sales set ename=#{ename},eid=#{eid},date=#{date},pname=#{pname},ptype=#{ptype},price=#{price},number=#{number},account=#{account},client_phone=#{client_phone},client_address=#{client_address} where aid=#{aid} ")
    public int updateAccountSale(int aid, String ename, String eid, Date date, String pname, String ptype, int price, int number, int account, String client_phone, String client_address);

}
