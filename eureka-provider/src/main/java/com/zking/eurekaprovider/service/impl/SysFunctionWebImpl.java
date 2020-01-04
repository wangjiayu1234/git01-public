package com.zking.eurekaprovider.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.eurekaprovider.mapper.SysFunctionWebMapper;
import com.zking.eurekaprovider.model.SysFunctionWeb;
import com.zking.eurekaprovider.service.ISysFunctionWeb;
import com.zking.eurekaprovider.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class SysFunctionWebImpl implements ISysFunctionWeb {
    @Autowired
    private SysFunctionWebMapper sysFunctionWebMapper;

    @Override
    public List<SysFunctionWeb> selectgetAll(Map map, PageBean pageBean) {
        if(pageBean != null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<SysFunctionWeb> articles = this.sysFunctionWebMapper.selectgetAll(map);
        if(pageBean != null && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(articles);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return articles;
    }

    @Override
    public int insert(SysFunctionWeb record) {
        return sysFunctionWebMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SysFunctionWeb record) {
        return sysFunctionWebMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.sysFunctionWebMapper.deleteByPrimaryKey(id);
    }
}
