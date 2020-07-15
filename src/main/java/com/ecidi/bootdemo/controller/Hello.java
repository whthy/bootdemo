package com.ecidi.bootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: bootdemo
 * @description:
 * @create: 2020-05-18 20:15
 **/
@RestController
public class Hello {
    @RequestMapping("/hi")
    public String hello() {
        return "hello spring boot";
    }
}
