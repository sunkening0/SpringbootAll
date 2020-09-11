package com.keelin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: ConfigController
 * RefreshScope注解是为了刷新配置来添加的，这样让配置仓库中的配置发生改变的时候，
 * 我们可以通过访问/refresh请求来刷新配置（由spring-boot-starter-actuator提供的监控功能）
 * @author: skn
 * @create: 2020-09-11 14:56
 */
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class ConfigController {

    @Value("${keelin.token}")
    private String token;
    @RequestMapping("/token")
    public String getToken() {
        return this.token;
    }
}