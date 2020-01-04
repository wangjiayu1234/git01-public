package com.zking.eurekaprovider.controller;

import com.zking.eurekaprovider.util.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class TestController {

    @RequestMapping(value="/test1/{name}",produces = {"application/json;charset=UTF-8"})
    public JsonData test1(@PathVariable("name") String name) {
        log.info("生产者test1:"+name);
        JsonData jsonData = new JsonData();
        jsonData.setCode(0);
        jsonData.put("name",name);
        return jsonData;
    }

    @RequestMapping(value="/test2",produces = {"application/json;charset=UTF-8"})
    public JsonData test2(@RequestParam("name") String name) {
        log.info("生产者test2:"+name);
        JsonData jsonData = new JsonData();
        jsonData.setCode(0);
        jsonData.put("name",name);
        return jsonData;
    }

    @RequestMapping(value="/test3",produces = {"application/json;charset=UTF-8"})
    public JsonData test3(@RequestParam("name") String name,@RequestParam("price") int price) {
        log.info("生产者test3:"+name);
        log.info("生产者test3:"+price);
        JsonData jsonData = new JsonData();
        jsonData.setCode(0);
        jsonData.put("name",name);
        jsonData.put("price",price);
        return jsonData;
    }
}
