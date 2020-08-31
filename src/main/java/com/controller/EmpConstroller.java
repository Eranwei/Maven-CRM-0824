package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.Emp;
import com.service.EmpService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emp")
@ResponseBody
public class EmpConstroller {
    @Autowired
    private EmpService empService;

    @RequestMapping("/list")
    public Map list1(Emp emp,int pageNum, int size){
        System.out.println(empService);
        PageInfo<Emp> pageInfo = empService.list(new Emp(0, ""), pageNum, size);
        Map map = new HashMap();
        List<Emp> emps = pageInfo.getList();
        map.put("emps",emps);
        map.put("rowCount",pageInfo.getTotal());
        map.put("pageCount",pageInfo.getPages());

        return map;
    }



    //新增员工
    @RequiresPermissions("empEdit")
    @RequestMapping("/edit")
    public boolean edit(Emp emp){
        empService.add(emp);
        return true;
    }
    @RequiresPermissions("empUpdate")
    @RequestMapping("/update")
    public boolean update(Emp emp){
        empService.edit(emp);
        return true;
    }

    @RequiresPermissions("empDel")
    @RequestMapping("/del")
    public boolean del(Emp emp){
        empService.del(emp);
        return true;
    }

    @RequestMapping("/getById")
    public Emp getById(int empno){
        return  empService.getEmpById(empno);
    }



}
