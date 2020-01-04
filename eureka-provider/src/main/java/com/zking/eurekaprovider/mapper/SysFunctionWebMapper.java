package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.SysFunctionWeb;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface SysFunctionWebMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(SysFunctionWeb record);

    int insertSelective(SysFunctionWeb record);

    SysFunctionWeb selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(SysFunctionWeb record);

    int updateByPrimaryKey(SysFunctionWeb record);

    List<SysFunctionWeb> selectgetAll(Map map);
}