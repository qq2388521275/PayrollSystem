package com.payrollSystem.main.Salary.Services;


import com.alibaba.fastjson.JSONObject;
import com.payrollSystem.main.Login.Entity.Employee;
import com.payrollSystem.main.Login.Entity.EmployeeVO;
import com.payrollSystem.main.Login.Mappers.UserMapper;
import com.payrollSystem.main.Salary.Entity.SalaryDO;
import com.payrollSystem.main.Salary.Entity.SalaryVO;
import com.payrollSystem.main.Salary.Entity.WorkTimeDO;
import com.payrollSystem.main.Order.Entity.AccountSaleSheetVO;
import com.payrollSystem.main.Order.Mappers.AccountSaleMapper;
import com.payrollSystem.main.Sheet.Mappers.SheetMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

@Service
public class SalaryService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private SheetMapper sheetMapper;
    @Resource
    private AccountSaleMapper accountSaleMapper;


    public java.sql.Date StringToDate(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        java.util.Date d = null;
        try {
            d = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new java.sql.Date(d.getTime());

    }
    public SalaryVO getSalary(String salary){
        SalaryDO salaryDO=JSONObject.parseObject(salary, SalaryDO.class);
        SalaryVO ret=new SalaryVO();
        ret.setEid(salaryDO.getEid());
        ret.setEname(userMapper.selectName(salaryDO.getEid()));
        ret.setSumHour(0);
        String paytype= userMapper.selectPaytype(salaryDO.getEid());
        Calendar calendar=new GregorianCalendar();
        calendar.setTime(salaryDO.getBeginTime());
        Date begin=salaryDO.getBeginTime();
        Date endtime=salaryDO.getEndTime();
        double ret_salary=0;
        switch (paytype){
            case "小时工":
                // 起始日期到终止日期，每天工作时间和worktime做比较，每一天查询后时间+1
                int hourSalary= userMapper.getHourSalary(salaryDO.getEid());
                while(begin.compareTo(endtime)<=0){
                    WorkTimeDO workTimeDO= sheetMapper.selectTime(salaryDO.getEid(),begin);
                    if(workTimeDO!=null){
                        String[] end_str =workTimeDO.getWorkend().split(":");
                        String[] begin_str=workTimeDO.getWorkstart().split(":");
                        int min=Integer.parseInt(end_str[1])-Integer.parseInt(begin_str[1]);
                        int hour=Integer.parseInt(end_str[0])-Integer.parseInt(begin_str[0]);
                        if (min<0){
                            hour-=1;
                            min+=60;
                        }
                        double worktime=hour+min/60.0;
                        ret.setSumHour(ret.getSumHour()+worktime);
                        ret_salary= (worktime-workTimeDO.getWorktime()>0?ret_salary+workTimeDO.getWorktime()*hourSalary+(worktime-workTimeDO.getWorktime())*1.5*hourSalary:ret_salary+worktime*hourSalary);
                    }
                    calendar.add(Calendar.DATE,1);
                    //日期+1
                    java.util.Date d=calendar.getTime();
                    String search=String.format("%tF",d);
                    begin=StringToDate(search);
                }
//                //加上endday
//                WorkTimeDO workTimeDO=sheetMapper.selectTime(salaryDO.getEid(),salaryDO.getEndTime());
//                if(workTimeDO!=null){
//                    String[] end_str =workTimeDO.getWorkend().split(":");
//                    String[] begin_str=workTimeDO.getWorkstart().split(":");
//                    int min=Integer.parseInt(end_str[1])-Integer.parseInt(begin_str[1]);
//                    int hour=Integer.parseInt(end_str[0])-Integer.parseInt(begin_str[0]);
//                    if (min<0){
//                        hour-=1;
//                        min+=60;
//                    }
//                    double worktime=hour+min/60.0;
//                    ret.setSumHour(ret.getSumHour()+worktime);
//                    ret_salary= (worktime-workTimeDO.getWorktime()>0?ret_salary+workTimeDO.getWorktime()*hourSalary+(worktime-workTimeDO.getWorktime())*1.5*hourSalary:ret_salary+worktime*hourSalary);
//
//                }
                ret.setSumSalary(ret_salary);
                break;
            case "销售员":
                EmployeeVO employeeVO= userMapper.selectEmployee(salaryDO.getEid());
                ret_salary+= employeeVO.getSalary();
                List<AccountSaleSheetVO> list= accountSaleMapper.selectByName(salaryDO.getEid());
                for(AccountSaleSheetVO i:list){
                    //比较日期可能有问题
                    if(i.getDate().compareTo(salaryDO.getBeginTime())>0 && i.getDate().compareTo(salaryDO.getEndTime())<0)
                        ret_salary+=i.getAccount()*employeeVO.getSalaryrate();
                }
                ret.setSumSalary(ret_salary);
                while(begin.compareTo(endtime)<=0){
                    WorkTimeDO workTimeDO= sheetMapper.selectTime(salaryDO.getEid(),begin);
                    if(workTimeDO!=null){
                        String[] end_str =workTimeDO.getWorkend().split(":");
                        String[] begin_str=workTimeDO.getWorkstart().split(":");
                        int min=Integer.parseInt(end_str[1])-Integer.parseInt(begin_str[1]);
                        int hour=Integer.parseInt(end_str[0])-Integer.parseInt(begin_str[0]);
                        if (min<0){
                            hour-=1;
                            min+=60;
                        }
                        double worktime=hour+min/60.0;
                        ret.setSumHour(ret.getSumHour()+worktime);
                    }
                    calendar.add(Calendar.DATE,1);
                    //日期+1
                    java.util.Date d=calendar.getTime();
                    String search=String.format("%tF",d);
                    begin=StringToDate(search);
                }
                break;
            case "带薪":
                EmployeeVO employeeVO_month= userMapper.selectEmployee(salaryDO.getEid());
                ret_salary+=employeeVO_month.getSalary();
                ret.setSumSalary(ret_salary);
                while(begin.compareTo(endtime)<=0){
                    WorkTimeDO workTimeDO= sheetMapper.selectTime(salaryDO.getEid(),begin);
                    if(workTimeDO!=null){
                        String[] end_str =workTimeDO.getWorkend().split(":");
                        String[] begin_str=workTimeDO.getWorkstart().split(":");
                        int min=Integer.parseInt(end_str[1])-Integer.parseInt(begin_str[1]);
                        int hour=Integer.parseInt(end_str[0])-Integer.parseInt(begin_str[0]);
                        if (min<0){
                            hour-=1;
                            min+=60;
                        }
                        double worktime=hour+min/60.0;
                        if(worktime<8){
                            ret.setSumSalary(ret.getSumSalary()-100);
                        }
                        ret.setSumHour(ret.getSumHour()+worktime);
                    }
                    calendar.add(Calendar.DATE,1);
                    //日期+1
                    java.util.Date d=calendar.getTime();
                    String search=String.format("%tF",d);
                    begin=StringToDate(search);
                }
                break;
        }
        return ret;
    }

}
