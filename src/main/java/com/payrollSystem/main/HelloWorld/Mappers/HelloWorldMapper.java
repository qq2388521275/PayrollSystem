package com.payrollSystem.main.HelloWorld.Mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HelloWorldMapper {
    @Select("SELECT hello_message FROM hello_world WHERE status = 1")
    @Result(column = "hello_message",javaType = String.class)
    List<String> selectAllMessage();
}
