package com.payrollSystem.main.Sheet.Mappers;


import com.payrollSystem.main.Sheet.Entity.SheetDO;
import com.payrollSystem.main.Sheet.Entity.SheetVO;
import org.apache.ibatis.annotations.*;

import java.sql.Date;
import java.util.List;

@Mapper
public interface SheetMapper {

    @Select("select * from attendancecard where eid=#{eid} and status=1")
    @Results({
            @Result(property = "aid", column = "aid"),
            @Result(property = "eid", column = "eid"),
            @Result(property = "ename", column = "ename"),
            @Result(property = "date", column = "date"),
            @Result(property = "weekend", column = "weekend"),
            @Result(property = "workstart", column = "workstart"),
            @Result(property = "workend", column = "workend"),
            @Result(property = "worktime", column = "worktime"),
            @Result(property = "exworktime", column = "exworktime"),
            @Result(property = "vacation", column = "vacation"),
            @Result(property = "personal_leave", column = "personal_leave"),
            @Result(property = "illness_leave", column = "illness_leave"),
            @Result(property = "commit", column = "commit")

    })
    List<SheetDO> selectByName(String eid);

    @Select("SELECT DAYOFWEEK(#{date})")
        //1=星期天
    int DateToweekday(Date date);

    @Select("Select aid,workstart,workend,weekday,commit from attendancecard where status=1 and date=#{date} and eid=#{eid}")
    @Results({
            @Result(property = "aid", column = "aid"),
            @Result(property = "workstart", column = "workstart"),
            @Result(property = "workend", column = "workend"),
            @Result(property = "weekday", column = "weekday"),
            @Result(property = "commit", column = "commit")
    })
    SheetVO selectDate(Date date,String eid);

    @Insert("Insert INTO attendancecard (eid,workstart,workend,weekday,date,commit) VALUES (#{eid},#{workstart},#{workend},#{weekday},#{now},#{commit})")
    int addToSheet(String eid, String workstart, String workend, int weekday, Date now, int commit);

    @Update("UPDATE attendancecard SET workstart=#{workstart},workend=#{workend},commit=#{commit} WHERE aid=#{aid}")
    int updateSheet(int aid, String workstart, String workend, int commit);
}
