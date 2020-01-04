package com.zking.eurekaconsumer02.service;

import com.zking.eurekaconsumer02.service.fallback.HelloFeiginFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "eureka-provider",fallback = HelloFeiginFallback.class)//eureka-provider即生产者在注册中心注册的名字
//在该调用中，我们feign并不需要指定端口号，它并不知道这个方法所在的服务提供者现在在哪个端口运行，我们只需要向eureka寻求服务。
public interface HelloFeigin {
    @RequestMapping("/hello")
    String hello();
}