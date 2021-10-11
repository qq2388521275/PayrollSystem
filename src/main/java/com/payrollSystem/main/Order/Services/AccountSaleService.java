package com.payrollSystem.main.Order.Services;


import com.alibaba.fastjson.JSONObject;
import com.payrollSystem.main.Order.Entity.AccountSaleSheetVO;
import com.payrollSystem.main.Order.Mappers.AccountSaleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

@Service
public class AccountSaleService {
    @Resource
    private AccountSaleMapper accountSaleMapper;

    public List<AccountSaleSheetVO> selectAll() {
        return accountSaleMapper.selectAll();
    }

    public List<AccountSaleSheetVO> selectByName(String eid) {
        return accountSaleMapper.selectByName(eid);
    }

    //    public java.sql.Date StringToDate(String date) {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        format.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
//        java.util.Date d = null;
//        try {
//            d = format.parse(date);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        assert d != null;
//        return new java.sql.Date(d.getTime());
//
//    }
    public int addAccountSale(String record) {
        AccountSaleSheetVO accountSaleSheetVO = JSONObject.parseObject(record, AccountSaleSheetVO.class);
//        JSONObject object = JSONObject.parseObject(record);
//        String date=(String)object.get("date");
//        java.sql.Date d=StringToDate(date);
//        accountSaleSheetVO.setDate(d);

        return accountSaleMapper.addAccountSale(accountSaleSheetVO.getEname(), accountSaleSheetVO.getEid(), accountSaleSheetVO.getDate(),
                accountSaleSheetVO.getPname(), accountSaleSheetVO.getPtype(), accountSaleSheetVO.getPrice(), accountSaleSheetVO.getNumber(),
                accountSaleSheetVO.getClient_phone(), accountSaleSheetVO.getClient_address(), accountSaleSheetVO.getPrice() * accountSaleSheetVO.getNumber());

    }

    public int deleteAccountSale(int aid) {
        return accountSaleMapper.deleteAccountSale(aid);
    }

    public int updateAccountSale(String record) {
        AccountSaleSheetVO accountSaleSheetVO = JSONObject.parseObject(record, AccountSaleSheetVO.class);
        return accountSaleMapper.updateAccountSale(accountSaleSheetVO.getAid(), accountSaleSheetVO.getEname(), accountSaleSheetVO.getEid(),
                accountSaleSheetVO.getDate(), accountSaleSheetVO.getPname(), accountSaleSheetVO.getPtype(), accountSaleSheetVO.getPrice(), accountSaleSheetVO.getNumber(),
                accountSaleSheetVO.getPrice()*accountSaleSheetVO.getNumber(), accountSaleSheetVO.getClient_phone(), accountSaleSheetVO.getClient_address());
    }

}
