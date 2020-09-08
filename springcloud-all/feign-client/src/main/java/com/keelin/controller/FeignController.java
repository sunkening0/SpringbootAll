package com.keelin.controller;

import com.keelin.service.FeignRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignRemoteService feignRemoteService;

    @GetMapping(value = "/getHello")
    public String getHello() {
        return feignRemoteService.hello();
    }
}
