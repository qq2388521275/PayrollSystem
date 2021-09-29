package com.payrollSystem.main.Login.Mappers;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT password FROM employee WHERE eid = #{uid} AND status=1")
    @Result(column = "password", javaType = String.class)
    String selectAns(String uid);

}
