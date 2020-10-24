package com.yang.gmall.service;

import com.yang.bean.UserAddress;
import com.yang.bean.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 查询所有数据
     */
    List<UserInfo> finAll();

    List<UserAddress> getUserAddressList(String userId);
}
