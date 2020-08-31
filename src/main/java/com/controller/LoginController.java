package com.controller;

import com.model.Employee;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(Employee emp){

        //讲用户封装成token
        AuthenticationToken token = new UsernamePasswordToken(emp.getUserName(), emp.getUserPassword());
        //获得当前的Subject
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            //认证成功
            return "redirect:/admin/index.html";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            //认证失败
            return "redirect:/login.html";
        }
    }


    //注销
    @RequestMapping("/user/logout")
    public String logout(){
        //获得当前的Subject
        Subject subject = SecurityUtils.getSubject();
        subject.logout();

        return "redirect:/login.html";
    }
}
