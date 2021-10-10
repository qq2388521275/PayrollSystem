package com.payrollSystem.main.Login.Controllers;


import com.alibaba.fastjson.JSONObject;
import com.payrollSystem.main.Login.Entity.EmployeeVO;
import com.payrollSystem.main.Login.Service.UserService;
import com.payrollSystem.main.ResponseResult.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @ResponseBody
    @GetMapping(value = "/login")
    public ResponseResult login(@RequestParam(name = "uid") String uid,
                                @RequestParam(name = "ans") String ans) {
        ResponseResult result = null;
        try {
            String real_ans = userService.login(uid);
            if (real_ans == null) {
                result = ResponseResult.newStatus(1001, "用户不存在");
            } else if (ans.equals(real_ans)) {
                result = ResponseResult.success("登录成功");
            } else {
                result = ResponseResult.newStatus(1002, "密码错误");
            }
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @PostMapping(value = "/apis/employee/insert")
    public ResponseResult InsertEmployee(@RequestParam(name = "jsonString") String jsonString) {
        ResponseResult result = null;
        try {
            EmployeeVO employeeVO = JSONObject.parseObject(jsonString, EmployeeVO.class);
            userService.insertEmployee(employeeVO);
            result = ResponseResult.success("插入成功");
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/apis/employee/queryAll")
    public ResponseResult selectEmployee() {
        ResponseResult result = null;
        try {
            result = ResponseResult.success(userService.selectEmployees());
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/apis/employee/delete")
    public ResponseResult deleteEmployee(@RequestParam(name = "eid")String eid) {
        ResponseResult result = null;
        try{
            int res = userService.deleteEmployee(eid);
            if (res > 0){
                result = ResponseResult.success("删除成功");
            } else {
                result = ResponseResult.newStatus(5001,"删除失败未找到有效信息");
            }
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @PostMapping(value = "/apis/employee/update")
    public ResponseResult updateEmployee(@RequestParam(name = "jsonString") String jsonString) {
        ResponseResult result = null;
        try {
            int count = userService.updateEmployee(jsonString);
            result = ResponseResult.success("修改成功，共修改" + count + "行");
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }


}
