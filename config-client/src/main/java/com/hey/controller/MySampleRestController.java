package com.hey.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MySampleRestController {
    @Value("${info.profile}")
    private String appName;

    @RequestMapping("/app-name")
    public String getAppName() {
        return appName;
    }
}