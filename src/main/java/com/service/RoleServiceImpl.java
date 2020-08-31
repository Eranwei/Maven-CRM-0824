package com.service;

import com.dao.RoleMapper;
import com.model.Role;
import com.model.RolePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("roleService")
public class RoleServiceImpl implements RoleService{
    @Autowired
    RoleMapper roleMapper;
    @Override
    public List list(Role role) {
        return roleMapper.list(role);
    }

    @Override
    public int insert(Role role){
        return roleMapper.insertSelective(role);
    }
    @Override
    public int update(Role role){
        return roleMapper.updateByPrimaryKey(role);
    }

    @Override
    public int shouquan(RolePermission record) {
        return roleMapper.shouquan(record);
    }

    @Override
    public int delete(int roleid){
        return roleMapper.delete(roleid);
    }
}
