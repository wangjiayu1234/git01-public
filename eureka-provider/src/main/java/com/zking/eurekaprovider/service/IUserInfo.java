package com.zking.eurekaprovider.service;

import com.zking.eurekaprovider.model.UserInfo;
import com.zking.eurekaprovider.util.PageBean;

import java.util.List;
import java.util.Map;

public interface IUserInfo {
    public List<UserInfo> selectgetAll(Map map, PageBean pageBean);

    public List<UserInfo> selectgetAll2(Map map, PageBean pageBean);

    public List<UserInfo> selectgetAll3(Map map, PageBean pageBean);

    public List<UserInfo> selectgetAll4(Map map, PageBean pageBean);

    public int insert(UserInfo record);

    public  int updateByPrimaryKeyWithBLOBs(UserInfo record);

    public  int deleteByPrimaryKey(Integer id);
}
