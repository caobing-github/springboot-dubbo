package com.dubbo.service;

import com.dubbo.entity.Dept;

/**
 * @program: dubbo
 * @description:
 * @author: caobing
 * @createtime: 2020-10-10
 */
public interface DeptService {
    //根据会议编号ID查询会议详细信息
    Dept queryByPcode(String pCode);
}
