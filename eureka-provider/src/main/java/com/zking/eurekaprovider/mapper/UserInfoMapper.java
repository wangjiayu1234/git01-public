package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectgetAll(Map map);

    List<UserInfo> selectgetAll2(Map map);

    List<UserInfo> selectgetAll3(Map map);

    List<UserInfo> selectgetAll4(Map map);
}