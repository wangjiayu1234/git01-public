package com.zking.eurekaprovider.controller;

import com.zking.eurekaprovider.model.User;
import com.zking.eurekaprovider.service.ISysGl;
import com.zking.eurekaprovider.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(produces = "application/json")
public class UserController {

    @Autowired
    private ISysGl iSysGl;

    @RequestMapping("/list")
    @ResponseBody
    public JsonData list(){
        List<User> list = this.iSysGl.list();
        JsonData jsonResult = new JsonData(1,"",list);
        return  jsonResult;
    }

    @RequestMapping("/update")
    @ResponseBody
    public JsonData update(User user){
        int edit = this.iSysGl.edit(user);
        JsonData jsonResult = new JsonData(1,"",edit);
        return  jsonResult;
    }


}
