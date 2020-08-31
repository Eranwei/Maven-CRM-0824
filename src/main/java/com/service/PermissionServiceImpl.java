package com.service;

import com.dao.PermissionMapper;
import com.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService{
    @Autowired
    PermissionMapper permissionMapper;
    @Override
    public List list(){
        return permissionMapper.list();
    }
    @Override
    public int update(Permission permission){
        return permissionMapper.updateByPrimaryKeySelective(permission);
    }
    @Override
    public int delete(int id){
        return permissionMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int insert(Permission permission){
        return permissionMapper.insert(permission);
    }
}
