package com.zking.eurekaconsumer02.service.fallback;

import com.zking.eurekaconsumer02.service.HelloFeigin;
import org.springframework.stereotype.Component;

@Component
public class HelloFeiginFallback implements HelloFeigin{
    @Override
    public String hello() {
        return "系统忙，请稍后再试";
    }
}
