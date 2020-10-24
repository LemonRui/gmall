package com.yang.gmall.user.controller;

import com.yang.bean.UserInfo;
import com.yang.gmall.service.UserService;
import com.yang.gmall.user.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    //这里使用 UserService和UserserviceImpl 都可以
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userServiceImpl.finAll();
    }


}
