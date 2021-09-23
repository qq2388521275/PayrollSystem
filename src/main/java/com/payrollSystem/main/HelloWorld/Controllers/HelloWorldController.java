package com.payrollSystem.main.HelloWorld.Controllers;

import com.payrollSystem.main.HelloWorld.Mappers.HelloWorldMapper;
import com.payrollSystem.main.ResponseResult.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@Slf4j
public class HelloWorldController {
    @Resource
    private HelloWorldMapper helloWorldMapper;

    @ResponseBody
    @GetMapping(value = "/hello")
    public ResponseResult hello() {
        ResponseResult result = null;
        try {
            result = ResponseResult.success(helloWorldMapper.selectAllMessage());
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/hello/add")
    public ResponseResult helloAdd(@RequestParam(name = "msg") String helloMessage) {
        ResponseResult result = null;
        try {
            int count = helloWorldMapper.insertWithMessage(helloMessage);
            result = ResponseResult.success("插入成功");
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/hello/update")
    public ResponseResult helloupdate(@RequestParam(name = "newMsg") String newMsg,
                              @RequestParam(name = "oldMsg") String oldMsg) {
        ResponseResult result = null;
        try {
            int count = helloWorldMapper.updateWithMessage(newMsg, oldMsg);
            result = ResponseResult.success("修改成功，共修改" + count + "行");
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/hello/delete")
    public ResponseResult hellodelete(@RequestParam(name = "msg") String helloMessage) {
        ResponseResult result = null;
        try {
            int count = helloWorldMapper.deleteWithMessage(helloMessage);
            result = ResponseResult.success("删除成功，共删除" + count + "行");
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }
}
