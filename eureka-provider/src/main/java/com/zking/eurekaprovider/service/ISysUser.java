package com.zking.eurekaprovider.service;

import com.zking.eurekaprovider.model.SysUser;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ISysUser {
    @Transactional(readOnly = true)
    public SysUser login(SysUser sysUser);
}
