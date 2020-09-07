package com.keelin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String getHello() {
        //这里的**eurkaclient**是我上一篇文章新建的eureka客户端的名称
        return restTemplate.getForObject("http://eurkaclient/hello",String.class);
    }
}
