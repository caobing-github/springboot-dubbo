package com.dubbo.service.impl;

import com.dubbo.entity.Dept;
import com.dubbo.entity.User;
import com.dubbo.service.DeptService;
import com.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: dubbo
 * @description:
 * @author: caobing
 * @createtime: 2020-10-10
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptService deptService;

    @Autowired//表示要从dubbo里获取
    private UserService userService;
    @Override
    public Dept queryByPcode(String pCode) {
        Dept dept = new Dept().setId("1").setPcode(pCode).setTitle("标题").setContent("内容");
        User user=userService.queryById("1");
        System.out.println(dept);
        System.out.println(user);
        return null;
    }
}
