package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.Emp;
import com.model.Employee;
import com.service.EmpService;
import com.service.EmployeeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/employees")
@ResponseBody
public class EmployeeConstroller {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/list")
    public Map list1(Employee emp,int pageNum, int size){
        System.out.println(employeeService);
        PageInfo<Employee> pageInfo = employeeService.pageList(emp, pageNum, size);
        Map map = new HashMap();
        List<Employee> emps = pageInfo.getList();
        map.put("emps",emps);
        map.put("rowCount",pageInfo.getTotal());
        map.put("pageCount",pageInfo.getPages());

        return map;
    }

    @RequiresPermissions("adminReset")
    @RequestMapping("/modifyall")
    public int modifyall(){
        return  employeeService.modifyall();
    }

    //新增员工
    @RequiresPermissions("empEdit")
    @RequestMapping("/edit")
    public boolean edit(Employee emp){
        employeeService.add(emp);
        return true;
    }
    @RequiresPermissions("empUpdate")
    @RequestMapping("/update")
    public boolean update(Employee emp){
        employeeService.update(emp);
        return true;
    }

    @RequiresPermissions("empDel")
    @RequestMapping("/del")
    public boolean del(Integer empid){
        employeeService.del(empid);
        return true;
    }

    @RequestMapping("/getById")
    public Employee getById(int empid){
        return  employeeService.getById(empid);
    }


}
