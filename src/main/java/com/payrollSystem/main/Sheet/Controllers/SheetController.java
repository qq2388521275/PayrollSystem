package com.payrollSystem.main.Sheet.Controllers;


import com.payrollSystem.main.ResponseResult.ResponseResult;
import com.payrollSystem.main.Sheet.Entity.SheetDO;
import com.payrollSystem.main.Sheet.Mappers.SheetMapper;
import com.payrollSystem.main.Sheet.Services.SheetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/apis/Sheet")
@Controller
@Slf4j
public class SheetController {
    @Resource
    private SheetService sheetService;

//    @ResponseBody
//    @GetMapping(value = "/query")
//    public ResponseResult GetSheet(@RequestParam(name = "eid") String eid
//    ) {
//        ResponseResult result = null;
//        try {
//            result = ResponseResult.success(sheetService.selectByName(eid));
//        } catch (Exception e) {
//            result = ResponseResult.error(e.getMessage());
//            log.error(e.getMessage());
//        }
//        return result;
//    }

    //查询
    @ResponseBody
    @GetMapping(value = "/query")
    public ResponseResult GetSheet1(@RequestParam(name = "eid") String eid) {
        ResponseResult result = null;
        try {
            result = ResponseResult.success(sheetService.selectByName1(eid));
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/add")
    public ResponseResult add(@RequestParam(name = "eid") String eid,
                              @RequestParam(name = "workstart") String workstart,
                              @RequestParam(name = "workend") String workend,
                              @RequestParam(name = "weekday") int weekday,
                              @RequestParam(name = "commit") int commit) {
        ResponseResult result = null;
        try {
            int count = sheetService.addToSheet(eid, workstart, workend, weekday, commit);
            result = ResponseResult.success("插入成功");
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    //修改
    @ResponseBody
    @GetMapping(value = "/update")
    public ResponseResult helloupdate(@RequestParam(name = "aid") int aid,
                                      @RequestParam(name = "workstart") String workstart,
                                      @RequestParam(name = "workend") String workend,
                                      @RequestParam(name = "commit") int commit) {
        ResponseResult result = null;
        try {
            int count = sheetService.updateSheet(aid, workstart, workend, commit);
            result = ResponseResult.success("修改成功，共修改" + count + "行");
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

}
