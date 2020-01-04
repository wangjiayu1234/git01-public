//package com.zking.eurekaprovider.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloController {
//
//    @Value("${server.port}")
//    private String port;
//
//    @Value("${hello}")
//    private String hello = null;
//
//    @Value("${username}")
//    private String ds_username = null;
//
//    @Value("${password}")
//    private String ds_password = null;
//
//    @Value("${spring.redis.password}")
//    private String redis_password = null;
//
//    @RequestMapping("hello")
//    public String Hello(){
//        String msg="生产者["+port+"]为您服务,"+"ts:"+System.currentTimeMillis();
//        msg+=","+hello;
//        msg+=","+ds_username;
//        msg+=","+ds_password;
//        return  msg;
//    }
//}
