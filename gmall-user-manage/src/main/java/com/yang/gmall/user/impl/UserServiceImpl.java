package com.yang.gmall.user.impl;

import com.yang.bean.UserInfo;
import com.yang.gmall.service.UserService;
import com.yang.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> finAll() {
        return userInfoMapper.selectAll();
    }
}
