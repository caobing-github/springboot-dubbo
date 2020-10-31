package com.dubbo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: dubbo
 * @description: TODO
 * @author: caobing
 * @createtime: 2020-10-10
 */
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private String id;
    private String pcode;
    private String title;
    private String content;
}
