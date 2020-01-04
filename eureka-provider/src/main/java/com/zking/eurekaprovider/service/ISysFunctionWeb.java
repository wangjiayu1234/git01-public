package com.zking.eurekaprovider.service;

import com.zking.eurekaprovider.model.SysFunctionWeb;
import com.zking.eurekaprovider.util.PageBean;

import java.util.List;
import java.util.Map;

public interface ISysFunctionWeb {
    public List<SysFunctionWeb> selectgetAll(Map map, PageBean pageBean);


    public int insert(SysFunctionWeb record);

    public  int updateByPrimaryKeyWithBLOBs(SysFunctionWeb record);

    public  int deleteByPrimaryKey(Integer id);




}
