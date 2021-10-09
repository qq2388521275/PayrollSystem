package com.payrollSystem.main.Login.Service;


import com.alibaba.fastjson.JSONObject;
import com.payrollSystem.main.Login.Entity.EmployeeVO;
import com.payrollSystem.main.Login.Mappers.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public String login(String uid) {
        return userMapper.selectAns(uid);
    }

    public int insertEmployee(EmployeeVO employeeVO) {
        return userMapper.insertEmployee(employeeVO.getSalary(), employeeVO.getSalaryrate(), employeeVO.getHoursalary(),
                employeeVO.getPaytype(), employeeVO.getSalaryway(), employeeVO.getEname(), employeeVO.getEsex(), employeeVO.getEposition(),
                employeeVO.getDepartment(), employeeVO.getPhonenumber(), employeeVO.getEmail(), employeeVO.getTex_remisstion(),
                employeeVO.getTimelimit(), employeeVO.getVacation_day(), employeeVO.getPassword(), 1,employeeVO.getEid());
    }

    public EmployeeVO selectEmployee(int eid) {
        EmployeeVO e = userMapper.selectEmployee(eid);
        return e;
    }

    public int updateEmployee(String jsonString) {
        EmployeeVO employeeVO = JSONObject.parseObject(jsonString, EmployeeVO.class);
        return userMapper.updateEmployee(employeeVO.getSalary(), employeeVO.getSalaryrate(), employeeVO.getHoursalary(), employeeVO.getPaytype(), employeeVO.getSalaryway(),
                employeeVO.getEname(), employeeVO.getEsex(), employeeVO.getEposition(), employeeVO.getDepartment(), employeeVO.getPhonenumber(), employeeVO.getEmail(),
                employeeVO.getTex_remisstion(), employeeVO.getTimelimit(), employeeVO.getVacation_day(), employeeVO.getPassword(), employeeVO.getEid());
    }


}
