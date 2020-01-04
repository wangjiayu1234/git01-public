package com.zking.eurekaconsumer01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String Hello(){
        String url="http://localhost:7201/hello";
        String data = restTemplate.getForObject(url, String.class);
        return data;
    }
}
