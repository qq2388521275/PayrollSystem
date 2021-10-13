package com.payrollSystem.main.Salary.Controllers;


import com.payrollSystem.main.ResponseResult.ResponseResult;
import com.payrollSystem.main.Salary.Services.SalaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@Slf4j

public class SalaryController {
    @Resource
    private SalaryService salaryService;

    @ResponseBody
    @PostMapping(value = "/apis/getSalary")
    public ResponseResult getSalary(@RequestParam(name = "jsonString") String salary) {
        ResponseResult result = null;
        try {
            result = ResponseResult.success(salaryService.getSalary(salary));
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }


}
