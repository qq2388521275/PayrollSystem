package com.payrollSystem.main.Login.Service;


import com.payrollSystem.main.Login.Mappers.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public String login(String uid) {
        return userMapper.selectAns(uid);
    }
}
