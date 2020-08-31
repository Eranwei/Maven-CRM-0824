package com.controller;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/test")
public class TestController {

    @RequiresAuthentication
    @RequestMapping("/authc")
    public String authc(){
        return "autc";
    }

    @RequiresRoles("admin")
    @RequestMapping("/role1")
    public String role1(){
        return "role1";
    }

    @RequiresPermissions("emp:list")
    @RequestMapping("/perm1")
    public String perm1(){
        return "perm1";
    }

    @RequiresPermissions("emp:edit")
    @RequestMapping("/perm2")
    public String perm2(){
        return "perm2";
    }


}
