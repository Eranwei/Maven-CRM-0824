package com.service;

import com.dao.PermissionMapper;
import com.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("permService")
public class   PermServiceImpl implements PermService {

    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public List<Permission> getPermsByRoleId(Integer roleid) {

        return permissionMapper.getPermsByRoleId(roleid);
    }
}
