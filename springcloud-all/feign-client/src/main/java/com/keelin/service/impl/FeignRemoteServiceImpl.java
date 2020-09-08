package com.keelin.service.impl;

import com.keelin.service.FeignRemoteService;
import org.springframework.stereotype.Component;

/**
 * 添加熔断器调用方法(发生熔断时调用此方法)
 */
@Component
public class FeignRemoteServiceImpl implements FeignRemoteService {
    @Override
    public String hello() {
        return "hystrix起作用了";
    }
}
