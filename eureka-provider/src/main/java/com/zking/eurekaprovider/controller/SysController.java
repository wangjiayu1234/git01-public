package com.zking.eurekaprovider.controller;
import com.zking.eurekaprovider.model.SysFunction;
import com.zking.eurekaprovider.service.ISys;
import com.zking.eurekaprovider.util.JsonData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

//@RestController
@Controller
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping(produces = "application/json")
public class SysController {

        @Autowired
        private ISys iSys;

        @RequestMapping("/getall")
        @ResponseBody
        public  JsonData getTree(){
         List<SysFunction> tree = this.iSys.list();
         JsonData jsonResult = new JsonData(1,"",tree);
         return  jsonResult;
        }

}
