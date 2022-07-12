package com.xz.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${user.name}")
    private String userName;

    @RequestMapping("/show")
    public String show(){
        return userName;
    }
}
