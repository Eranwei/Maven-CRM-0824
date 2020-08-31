package com.service;

import com.model.Role;
import com.model.RolePermission;

import java.util.List;

public interface RoleService {
    List list(Role role);

    int insert(Role role);
    int delete(int roleid);
    int update(Role role);

    int shouquan(RolePermission record);

}
