package com.payrollSystem.main.HelloWorld.Mappers;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HelloWorldMapper {
    @Select("SELECT hello_message FROM hello_world WHERE status = 1")
    @Result(column = "hello_message", javaType = String.class)
    List<String> selectAllMessage();

    @Insert("INSERT INTO hello_world (hello_message) VALUES (#{helloMessage})")
    int insertWithMessage(String helloMessage);

    @Update("UPDATE hello_world SET hello_message = #{newMsg} WHERE status = 1 AND hello_message = #{oldMsg}")
    int updateWithMessage(String newMsg, String oldMsg);

    @Update("UPDATE hello_world SET status = 0 WHERE status = 1 AND hello_message = #{helloMessage}")
    int deleteWithMessage(String helloMessage);
}
