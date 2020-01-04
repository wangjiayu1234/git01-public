package com.zking.eurekaconsumer02.controller;

import com.zking.eurekaconsumer02.service.BookFeigin;
import com.zking.vo.model.BookVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private BookFeigin bookFeigin;

    @RequestMapping("/add")
    public String add(BookVo bookVo) {
        log.info("ID:"+bookVo.getId());
        log.info("Name:"+bookVo.getName());
        log.info("Price:"+bookVo.getPrice());
        String data = bookFeigin.add(bookVo);
        return data;
    }

}
