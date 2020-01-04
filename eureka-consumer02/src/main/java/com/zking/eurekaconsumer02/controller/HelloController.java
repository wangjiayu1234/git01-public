package com.zking.eurekaconsumer02.controller;

import com.zking.eurekaconsumer02.service.HelloFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloFeigin helloFeigin;

    @Value("${server.port}")
    private String port;
    @RequestMapping("/hello")
    public String hello() {
        String data="Hello,消费者["+port+"],"+helloFeigin.hello();
        return data;
    }
}
