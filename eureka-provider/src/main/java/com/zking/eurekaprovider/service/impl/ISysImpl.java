package com.zking.eurekaprovider.service.impl;

import com.zking.eurekaprovider.mapper.SysFunctionMapper;
import com.zking.eurekaprovider.model.SysFunction;
import com.zking.eurekaprovider.service.ISys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISysImpl implements ISys {
    @Autowired
    private SysFunctionMapper SysFunctionMapper;
    @Override
    public List<SysFunction> list() {

        return SysFunctionMapper.list();
    }
}
