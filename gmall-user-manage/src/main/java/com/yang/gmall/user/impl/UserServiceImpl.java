package com.yang.gmall.user.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yang.bean.UserAddress;
import com.yang.bean.UserInfo;
import com.yang.gmall.service.UserService;
import com.yang.gmall.user.mapper.UserAddressMapper;
import com.yang.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> finAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        //select * from userAddress where userId=?
        UserAddress userAddress=new UserAddress();
        userAddress.setId(userId);
        return userAddressMapper.select(userAddress);
    }
}
