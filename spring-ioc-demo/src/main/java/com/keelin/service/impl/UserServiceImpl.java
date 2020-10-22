package com.keelin.service.impl;

import com.keelin.annotation.SelfAutowired;
import com.keelin.annotation.SelfService;
import com.keelin.service.OrderService;
import com.keelin.service.UserService;

/**
 * @description: test
 * @author: skn
 * @create: 2020-10-22 10:28
 */
@SelfService
public class UserServiceImpl implements UserService {
    @SelfAutowired
    private OrderServiceImpl orderServiceImpl;

    @Override
    public String add() {
        return orderServiceImpl.test();
    }
}