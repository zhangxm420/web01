package com.atguigu.service.impl;

import com.atguigu.service.UserService;

/**
 * @author zhangxm
 * @create 2020-02-11 14:42
 */
public class UserServiceImpl implements UserService {
    @Override
    public void insert(String name) {
        System.out.println(name);
    }
}
