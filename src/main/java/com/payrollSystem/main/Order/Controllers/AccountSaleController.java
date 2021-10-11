package com.payrollSystem.main.Order.Controllers;


import com.payrollSystem.main.Order.Entity.AccountSaleSheetVO;
import com.payrollSystem.main.ResponseResult.ResponseResult;
import com.payrollSystem.main.Order.Services.AccountSaleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Slf4j
@RequestMapping(value = "/apis/order")
public class AccountSaleController {
    @Resource
    private AccountSaleService accountSaleService;

    @ResponseBody
    @GetMapping(value = "/selectAll")
    public ResponseResult ASelect() {
        ResponseResult result = null;
        try {
            result = ResponseResult.success(accountSaleService.selectAll());
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    @ResponseBody
    @GetMapping(value = "/selectByName")
    public ResponseResult SelectByName(@RequestParam(name = "eid") String eid) {
        ResponseResult result = null;
        try {
            List<AccountSaleSheetVO> vos = accountSaleService.selectByName(eid);
            if (vos.size() == 0) {
                result = ResponseResult.newStatus(5001, "未找到信息");
            } else {
                result = ResponseResult.success(vos);
            }
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    //添加
    @ResponseBody
    @PostMapping(value = "/add")
    public ResponseResult addAccountSale(@RequestParam(name = "form") String record) {
        ResponseResult result = null;
        try {
            int count = accountSaleService.addAccountSale(record);
            result = ResponseResult.success("插入成功");
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    //删除
    @ResponseBody
    @GetMapping(value = "/delete")
    public ResponseResult deleteAccountSale(@RequestParam(name = "aid") int aid) {
        ResponseResult result = null;
        try {
            int count = accountSaleService.deleteAccountSale(aid);
            result = ResponseResult.success("删除成功");
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }

    //更新
    @ResponseBody
    @PostMapping(value = "/update")
    public ResponseResult updateAccountSale(@RequestParam(name = "jsonString") String record) {
        ResponseResult result = null;
        try {
            int count = accountSaleService.updateAccountSale(record);
            result = ResponseResult.success("修改成功");
        } catch (Exception e) {
            result = ResponseResult.error(e.getMessage());
            log.error(e.getMessage());
        }
        return result;
    }
}
