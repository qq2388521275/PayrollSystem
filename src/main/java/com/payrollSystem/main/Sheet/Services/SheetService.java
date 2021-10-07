package com.payrollSystem.main.Sheet.Services;

import com.payrollSystem.main.Sheet.Entity.SheetDO;
import com.payrollSystem.main.Sheet.Entity.SheetVO;
import com.payrollSystem.main.Sheet.Mappers.SheetMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


@Service
public class SheetService {
    @Resource
    private SheetMapper sheetMapper;

    public List<SheetDO> selectByName(String uid) {
        return sheetMapper.selectByName(uid);
    }

    public java.sql.Date StringToDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        java.util.Date d = null;
        try {
            d = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert d != null;
        return new java.sql.Date(d.getTime());

    }

    //查询
    public List<SheetVO> selectByName1(String uid) {
        List<SheetVO> ret = new ArrayList<>();
        Date d = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(d);
        String search = String.format("%tF", d);
        java.sql.Date now = StringToDate(search);
        int weekday = sheetMapper.DateToweekday(now) - 1;
        if (weekday == 0) weekday += 7;
        calendar.add(Calendar.DATE, -weekday + 1);
        d = calendar.getTime();
        search = String.format("%tF", d);
        java.sql.Date begin = StringToDate(search);

        //调试
        for (int i = 1; i <= weekday; i++) {
            // 从begin 到 now 的java.sql.Date 查sheetMapper.
            SheetVO t = sheetMapper.selectDate(begin, uid);
            ret.add(t);
            calendar.add(Calendar.DATE, 1);
            d = calendar.getTime();
            search = String.format("%tF", d);
            begin = StringToDate(search);
        }
        return ret;
    }

    //添加
    public int addToSheet(String eid, String workstart, String workend, int weekday, int commit) {
        Date d = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(d);
        String search = String.format("%tF", d);
        java.sql.Date now = StringToDate(search);
        int now_weekday = sheetMapper.DateToweekday(now) - 1;
        if (now_weekday == 0) now_weekday += 7;
        calendar.add(Calendar.DATE, -now_weekday + 1);
        calendar.add(Calendar.DATE, weekday - 1);
        d = calendar.getTime();
        search = String.format("%tF", d);
        java.sql.Date day = StringToDate(search);
        return sheetMapper.addToSheet(eid, workstart, workend, weekday, day, commit);

    }

    //修改
    public int updateSheet(int aid, String workstart, String workend, int commit) {
        return sheetMapper.updateSheet(aid, workstart, workend, commit);
    }


}
