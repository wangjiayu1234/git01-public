package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser login(SysUser sysUser);
}