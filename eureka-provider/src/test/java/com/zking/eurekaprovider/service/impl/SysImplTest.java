package com.zking.eurekaprovider.service.impl;

import com.zking.eurekaprovider.model.SysFunction;
import com.zking.eurekaprovider.service.ISys;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class SysImplTest {

   @Autowired
   private ISys iSys;

   @Test
   public void aa(){
       List<SysFunction> list = iSys.list();
       for (SysFunction sFunction : list) {
           System.out.println(sFunction);
       }
   }
}