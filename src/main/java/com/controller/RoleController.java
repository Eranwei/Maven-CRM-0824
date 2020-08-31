package com.controller;

import com.model.Role;
import com.model.RolePermission;
import com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
@ResponseBody
public class RoleController {
    @Autowired
    RoleService roleService;

    @RequestMapping("/list")
    public Map list(){
        Map map=new HashMap();

        List list = roleService.list(new Role());

        map.put("list",list);
        return map;
    }

    @RequestMapping("/delete")
    public void delete(int roleId){
        roleService.delete(roleId);
    }
    @RequestMapping("/update")
    public void update(Role role){
        roleService.update(role);
    }
    @RequestMapping("/insert")
    public void insert(Role role){
        roleService.insert(role);
    }
    @RequestMapping("/shouquan")
    public void shouquan(RolePermission role){
        roleService.shouquan(role);
    }




}
