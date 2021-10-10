package com.payrollSystem.main.Login.Mappers;


import com.payrollSystem.main.Login.Entity.EmployeeVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT password FROM employee WHERE eid = #{uid} AND status=1")
    @Result(column = "password", javaType = String.class)
    String selectAns(String uid);

    @Insert("Insert INTO employee(salary,salaryrate,hoursalary,paytype,salaryway, ename,esex,eposition,department,phonenumber,email,tex_remission,timelimit,vacation_day,password,status,eid)" +
            "Values(#{salary},#{salaryrate},#{hoursalary}, #{paytype},#{salaryway},#{ename},#{esex},#{eposition},#{department},#{phonenumber},#{email},#{tex_remission},#{timelimit},#{vacation_day},#{password},#{status},#{eid})")
    int insertEmployee(int salary,float salaryrate,int hoursalary, String paytype,String salaryway, String ename,String esex,String eposition,String department,
                   String phonenumber,String email,int tex_remission,int timelimit,int vacation_day,String password,int status,String eid);

    @Select("SELECT * from employee where status=1")
    @Results({
            @Result(property = "eid",column = "eid"),
            @Result(property = "paytype",column = "paytype"),
            @Result(property = "salaryway",column = "salaryway"),
            @Result(property = "ename",column = "ename"),
            @Result(property = "esex",column = "esex"),
            @Result(property = "eposition",column = "eposition"),
            @Result(property = "department",column = "department"),
            @Result(property = "phonenumber",column = "phonenumber"),
            @Result(property = "email",column = "email"),
            @Result(property = "tex_remission",column = "tex_remission"),
            @Result(property = "salary",column = "salary"),
            @Result(property = "salaryrate",column = "salaryrate"),
            @Result(property = "hoursalary",column = "hoursalary"),
            @Result(property = "timelimit",column = "timelimit"),
            @Result(property = "vacation_day",column = "vacation_day"),
            @Result(property = "password",column = "password"),
    })
    List<EmployeeVO> selectAll();

    @Update("update employee set salary=#{salary},salaryrate= #{salaryrate},hoursalary=#{hoursalary},paytype= #{paytype},salaryway=#{salaryway},ename=#{ename},esex=#{esex},eposition=#{eposition},department=#{department},phonenumber=#{phonenumber},email=#{email},tex_remission=#{tex_remission},timelimit=#{timelimit},vacation_day=#{vacation_day},password=#{password} where status=1 AND eid=#{eid}")
    int updateEmployee(int salary,float salaryrate, int hoursalary, String paytype,String salaryway, String ename,String esex,String eposition,String department,
                       String phonenumber,String email,int tex_remission,int timelimit,int vacation_day,String password,String eid);

    @Update("UPDATE employee SET status=0 WHERE status=1 AND eid=#{eid}")
    int deleteEmployee(String eid);
}
