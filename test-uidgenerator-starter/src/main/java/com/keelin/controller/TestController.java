package com.keelin.controller;

import com.baidu.fsg.uid.service.UidGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UidGenService uidGenService;

    @GetMapping("/uid")
    public String genUid() {
        return String.valueOf("本次生成的唯一ID号为："+uidGenService.getUid());
    }
}