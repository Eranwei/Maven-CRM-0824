package com.controller;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@Component("roleOrFilter")
public class RoleFilter  extends AuthorizationFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse,
                                      Object obt) throws Exception {
        String roles[] = (String[]) obt;
        Subject subject = getSubject(servletRequest, servletResponse);

        if(roles==null||roles.length==0){
            //角色授权没有，权限授权可能有
            return true;
        }
        for (String role : roles) {
            if(subject.hasRole(role)){
                //只要满足一个角色就有角色授权
                return true;
            }
        }

        return false;
    }
}
