package com.service;

import com.model.Permission;

import java.util.List;

public interface PermService {
    List<Permission> getPermsByRoleId(Integer roleid);
}
