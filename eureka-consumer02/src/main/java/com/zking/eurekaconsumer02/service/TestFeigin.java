package com.zking.eurekaconsumer02.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient("eureka-provider")//eureka-provider即生产者在注册中心注册的名字
public interface TestFeigin {
    @RequestMapping("/test1/{name}")
    String test1(@PathVariable("name") String name);

    @RequestMapping("/test2")
    String test2(@RequestParam("name") String name);

    @RequestMapping("/test3")
    String test3(@RequestParam("name") String name,@RequestParam("price") int price);
}
