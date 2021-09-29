package com.payrollSystem.main.Login.Controllers;


import com.payrollSystem.main.Login.Mappers.UserMapper;
import com.payrollSystem.main.Login.Service.UserService;
import com.payrollSystem.main.ResponseResult.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Optional;

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

}
