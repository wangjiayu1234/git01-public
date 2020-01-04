package com.zking.eurekaprovider.controller;

import com.zking.eurekaprovider.util.JsonData;
import com.zking.vo.model.BookVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BookController {

    @RequestMapping(value="/add",produces = {"application/json;charset=UTF-8"})
    public JsonData add(@RequestBody BookVo bookVo) {
        log.info("ID:"+bookVo.getId());
        log.info("Name:"+bookVo.getName());
        log.info("Price:"+bookVo.getPrice());
        JsonData jsonData = new JsonData();
        jsonData.setCode(0);
        jsonData.setResult(bookVo);
        return jsonData;
    }
    @RequestMapping("hello")
    public String Hello(){
        String msg="生"+System.currentTimeMillis();

        return  msg;
    }
}
