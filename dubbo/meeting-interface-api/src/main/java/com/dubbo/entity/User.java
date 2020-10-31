package com.dubbo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class User implements Serializable {
    private String id;
    private String name;
    private String phone;
}
