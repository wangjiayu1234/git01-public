package com.zking.eurekaprovider.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.eurekaprovider.mapper.UserInfoMapper;
import com.zking.eurekaprovider.model.UserInfo;
import com.zking.eurekaprovider.service.IUserInfo;
import com.zking.eurekaprovider.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserInfoImpl implements IUserInfo {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> selectgetAll(Map map, PageBean pageBean) {
        if(pageBean != null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<UserInfo> articles = this.userInfoMapper.selectgetAll(map);
        if(pageBean != null && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(articles);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return articles;
    }
    @Override
    public List<UserInfo> selectgetAll2(Map map, PageBean pageBean) {
        if(pageBean != null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<UserInfo> articles = this.userInfoMapper.selectgetAll2(map);
        if(pageBean != null && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(articles);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return articles;
    }
    @Override
    public List<UserInfo> selectgetAll3(Map map, PageBean pageBean) {
        if(pageBean != null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<UserInfo> articles = this.userInfoMapper.selectgetAll3(map);
        if(pageBean != null && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(articles);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return articles;
    }
    @Override
    public List<UserInfo> selectgetAll4(Map map, PageBean pageBean) {
        if(pageBean != null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<UserInfo> articles = this.userInfoMapper.selectgetAll4(map);
        if(pageBean != null && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(articles);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return articles;
    }

    @Override
    public int insert(UserInfo record) {
        return userInfoMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.userInfoMapper.deleteByPrimaryKey(id);
    }
}
