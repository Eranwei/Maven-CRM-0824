package com.dao;

import com.model.Role;
import com.model.RolePermission;

import java.util.List;

public interface RoleMapper {
    List<Role> list(Role role);

    int delete(Integer rid);
    int insert(Role record);
    int update(Role record);


    int insertSelective(Role record);
    int updateByPrimaryKey(Role record);
    int shouquan(RolePermission record);

}