package com.keelin.service;

import com.keelin.service.impl.FeignRemoteServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Feign 采用的是基于接口的注解
 * Feign 整合了ribbon
 */
@FeignClient(value = "eurkaclient",fallback = FeignRemoteServiceImpl.class)
public interface FeignRemoteService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello();
}
