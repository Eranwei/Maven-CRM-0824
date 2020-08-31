package com.service;

import com.model.Permission;

import java.util.List;

public interface PermissionService {
    List list();
    int insert(Permission permission);
    int update(Permission permission);
    int delete(int id);
}
