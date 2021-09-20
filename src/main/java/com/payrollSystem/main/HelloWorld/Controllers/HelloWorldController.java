package com.payrollSystem.main.HelloWorld.Controllers;

import com.payrollSystem.main.HelloWorld.Mappers.HelloWorldMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Controller
@Slf4j
public class HelloWorldController {
    @Resource
    private HelloWorldMapper helloWorldMapper;

    @ResponseBody
    @GetMapping(value = "/hello")
    public List<String> hello() {
        List<String> result;
        try {
            result = helloWorldMapper.selectAllMessage();
        } catch (Exception e) {
            result = Collections.singletonList(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/hello/add")
    public String helloAdd(@RequestParam(name = "msg") String helloMessage) {
        String result;
        try {
            int count = helloWorldMapper.insertWithMessage(helloMessage);
            result = "插入成功";
        } catch (Exception e) {
            result = "修改失败，/hello/add接口异常";
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/hello/update")
    public String helloupdate(@RequestParam(name = "newMsg") String newMsg,
                              @RequestParam(name = "oldMsg") String oldMsg) {
        String result;
        try {
            int count = helloWorldMapper.updateWithMessage(newMsg, oldMsg);
            result = "修改成功，共修改" + count + "行";
        } catch (Exception e) {
            result = "修改失败，/hello/update接口异常";
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/hello/delete")
    public String hellodelete(@RequestParam(name = "msg") String helloMessage) {
        String result;
        try {
            int count = helloWorldMapper.deleteWithMessage(helloMessage);
            result = "删除成功，共删除" + count + "行";
        } catch (Exception e) {
            result = "删除失败，/hello/delete接口异常";
            log.error(e.getMessage());
        }
        return result;
    }
}
