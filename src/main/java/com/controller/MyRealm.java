package com.controller;

import com.model.Employee;
import com.model.Permission;
import com.service.EmployeeService;
import com.service.PermService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MyRealm extends AuthorizingRealm {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    PermService permService;

    //认证登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken up = (UsernamePasswordToken) token;
        String loginName = up.getUsername();
        //通过用户名查找用户
        Employee emp = employeeService.getByUserName(loginName);
        System.out.println(emp);
        //用户找不到
        if(emp==null){
            return null;
        }else{
            //比对查到的密码和登录页的密码
            return  new SimpleAuthenticationInfo(emp,emp.getUserPassword(),this.getName());
        }

    }


    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        Subject subject = SecurityUtils.getSubject();
        Employee emp = (Employee) subject.getPrincipal();
        System.out.println(emp);
        //授权角色
        //authorizationInfo.addRole("admin");
        //查后台数据
        Employee byUserName = employeeService.getByUserName(emp.getUserName());

        authorizationInfo.addRole(byUserName.getRoleInfo());

        //授权权限
        //authorizationInfo.addStringPermission("emp:list");
        //查后台数据
        List<Permission> perms = permService.getPermsByRoleId(emp.getRoleId());
        System.out.println(perms);
        for (Permission perm : perms) {
            if(perm.getPinfo()!=null && !"".equals(perm.getPinfo().trim())){
                authorizationInfo.addStringPermission(perm.getPinfo());
            }
        }

        return authorizationInfo;
    }


}
