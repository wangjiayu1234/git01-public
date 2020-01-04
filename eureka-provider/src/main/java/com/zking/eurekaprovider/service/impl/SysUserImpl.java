package com.zking.eurekaprovider.service.impl;

import com.zking.eurekaprovider.mapper.SysUserMapper;
import com.zking.eurekaprovider.model.SysUser;
import com.zking.eurekaprovider.service.ISysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserImpl implements ISysUser {
    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public SysUser login(SysUser sysUser) {
        return sysUserMapper.login(sysUser);
    }
}
