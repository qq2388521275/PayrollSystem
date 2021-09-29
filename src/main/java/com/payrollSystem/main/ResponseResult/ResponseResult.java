package com.payrollSystem.main.ResponseResult;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseResult {
    //http状态码：200成功，500异常
    private int status;
    //content返回值
    private Object content;

    public static ResponseResult success(Object obj) {
        return new ResponseResult(200, obj);
    }

    public static ResponseResult error(String msg) {
        return new ResponseResult(500, msg);
    }

    public static ResponseResult newStatus(int status, String msg) {
        return new ResponseResult(status, msg);
    }
}
