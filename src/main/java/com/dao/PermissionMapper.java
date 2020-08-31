package com.dao;

import com.model.Permission;

import java.util.List;

public interface PermissionMapper {
    List<Permission> getPermsByRoleId(Integer roleid);

    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    List list();

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}