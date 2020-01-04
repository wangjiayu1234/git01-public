package com.zking.eurekaconsumer02.service;

import com.zking.vo.model.BookVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Service
@FeignClient("eureka-provider")//eureka-provider即生产者在注册中心注册的名字
public interface BookFeigin {

    @RequestMapping("/add")
    String add(@RequestBody BookVo bookVo);
}
