package com.fenglingzmb.gulimall.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fenglingzmb
 * @date 2022/6/5
 */
@RestController
@RefreshScope
public class TestConfigCenterController {
    @Value("${gateway.user.name}")
    String name;

    @RequestMapping("/te")
    public String test(){
        return name;
    }
}
