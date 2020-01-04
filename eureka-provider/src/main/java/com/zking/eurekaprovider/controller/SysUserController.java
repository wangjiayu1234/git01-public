package com.zking.eurekaprovider.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zking.eurekaprovider.model.SysUser;
import com.zking.eurekaprovider.service.ISysUser;
import com.zking.eurekaprovider.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(produces = "application/json",path = "/user")
public class SysUserController {
    @Autowired
    private ISysUser iSysUser;

    @RequestMapping("/login")
    @ResponseBody
    public JsonData login(SysUser u, HttpServletRequest request, HttpServletResponse response) {
            JsonData jsonData = null;
            u=this.iSysUser.login(u);
            if(u!=null){
                jsonData = new JsonData(1, "登录成功", u);
            }else{
                jsonData = new JsonData(0, "用户或者密码错误", u);
            }
            return  jsonData;
    }
}
