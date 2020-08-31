package com.controller;

import com.model.Permission;
import com.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/permi")
public class PermissionController {
    @Autowired
    PermissionService permissionService;

    @RequestMapping("/list")
    public List list(){
        return permissionService.list();
    }
    @RequestMapping("/insert")
    public void insert(Permission permission){
        permissionService.insert(permission);
    }
    @RequestMapping("/update")
    public void update(Permission permission){
        permissionService.update(permission);
    }
    @RequestMapping("/delete")
    public void delete(int id){
        permissionService.delete(id);
    }




}
