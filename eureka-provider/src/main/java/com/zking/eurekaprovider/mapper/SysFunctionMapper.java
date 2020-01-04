package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.SysFunction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysFunctionMapper {

   List<SysFunction> list();

}
