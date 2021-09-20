package com.payrollSystem.main.HelloWorld.Controllers;

import com.payrollSystem.main.HelloWorld.Mappers.HelloWorldMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HelloWorldController {
    @Resource
    private HelloWorldMapper helloWorldMapper;

    @GetMapping(value = "/hello")
    @ResponseBody
    public List<String> hello() {
        return helloWorldMapper.selectAllMessage();
    }
}
