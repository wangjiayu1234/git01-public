package com.zking.eurekaprovider.service.impl;

import com.zking.eurekaprovider.mapper.UserMapper;
import com.zking.eurekaprovider.model.User;
import com.zking.eurekaprovider.service.ISysGl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISysGlImpl implements ISysGl {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public int edit(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
