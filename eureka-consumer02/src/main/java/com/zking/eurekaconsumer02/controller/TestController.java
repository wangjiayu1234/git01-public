package com.zking.eurekaconsumer02.controller;


import com.zking.eurekaconsumer02.service.TestFeigin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @Autowired
    private TestFeigin testFeigin;

    @RequestMapping("/test1/{name}")
    public String test1(@PathVariable("name") String name) {
        log.info("消费者test1Name:"+name);
        String data=testFeigin.test1(name);
        return data;
    }

    @RequestMapping("/test2")
    public String test2(String name) {
        log.info("消费者test2Name:"+name);
        String data=testFeigin.test2(name);
        return data;
    }

    @RequestMapping("/test3")
    public String test3(String name,int price) {
        log.info("消费者test3Name:"+name);
        log.info("消费者test3Price:"+name);
        String data = testFeigin.test3(name,price);
        return data;
    }
}
