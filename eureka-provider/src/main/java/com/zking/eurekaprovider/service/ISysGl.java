package com.zking.eurekaprovider.service;

import com.zking.eurekaprovider.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISysGl {

    @Transactional(readOnly = true)
    List<User> list();

    int edit(User user);

}
