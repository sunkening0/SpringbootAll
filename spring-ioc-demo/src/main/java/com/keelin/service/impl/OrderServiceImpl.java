package com.keelin.service.impl;

import com.keelin.annotation.SelfService;
import com.keelin.service.OrderService;

/**
 * @description: test
 * @author: skn
 * @create: 2020-10-22 10:30
 */
@SelfService
public class OrderServiceImpl implements OrderService {
    @Override
    public String test() {
        return "order";
    }
}