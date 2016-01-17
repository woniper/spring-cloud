package net.woniper.cloud.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by woniper on 2016. 1. 17..
 */
@RefreshScope
@RestController
public class ConfigMessageController {

    @Value("${message}")
    private String message;

    @RequestMapping("/msg")
    public String msg() {
        return this.message;
    }
}
