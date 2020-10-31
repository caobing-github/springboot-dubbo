package com.dubbo.service;


import com.dubbo.entity.User;

public interface UserService {
    /**
     * 根据用户id查询用户信息
     */
    User queryById(String id);
}
