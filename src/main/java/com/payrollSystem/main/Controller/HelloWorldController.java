package com.payrollSystem.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}
