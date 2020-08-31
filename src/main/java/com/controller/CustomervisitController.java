package com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Customer;
import com.model.CustomerVisit;
import com.model.Employee;
import com.service.CustomervisitService;
import com.service.EmployeeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller("customervisitController")
@RequestMapping("/customervisit")
public class CustomervisitController{
    @Autowired
    CustomervisitService customervisitService;
    @Autowired
    EmployeeService employeesService;
    //    获得员工名并查找ID
    @ResponseBody
    @RequestMapping("/empId")
    public void empIdGet(String username, HttpServletRequest request){
        Employee employees = employeesService.getByUserName(username);
        request.getSession().setAttribute("yEmpId",employees.getEmpid());
    }
    //    通过所有者查找
    @ResponseBody
    @RequestMapping("/elist")
    public Map empIdList(int pageNum, int size) {
        Map map = new HashMap<>();
        List<CustomerVisit> customervisits;
        PageInfo<CustomerVisit> info;
//        int empid = (int) request.getSession().getAttribute("yEmpId");
//        Employee employees = employeesService.getById(empid);
//        int roleid = employees.getRoleId();
//        if(roleid == 1 || roleid == 2){
            PageHelper.startPage(pageNum,size);
            customervisits = customervisitService.listAll();
            info = new PageInfo<>(customervisits);
//        }else {
//            PageHelper.startPage(pageNum,size);
//            customervisits = customervisitService.empIdList(empid);
//            info = new PageInfo<>(customervisits);
//        }
        map.put("customervisits",info.getList());
        map.put("rowCount",info.getTotal());
        map.put("pageCount",info.getPages());
        return map;
    }

    @ResponseBody
    @RequestMapping("/elist2")
    public Map newList(int pageNum, int size) {
        Subject sb= SecurityUtils.getSubject();
        Employee ep = (Employee) sb.getPrincipal();

        Map map = new HashMap<>();
        List<CustomerVisit> customervisits;
        PageInfo<CustomerVisit> info;

        PageHelper.startPage(pageNum,size);
        customervisits = customervisitService.empIdList(ep.getEmpid());
        info = new PageInfo<>(customervisits);

        map.put("customervisits",info.getList());
        map.put("rowCount",info.getTotal());
        map.put("pageCount",info.getPages());
        return map;
    }

    // 新增修改

    @RequiresPermissions("cusUpdate")
    @ResponseBody
    @RequestMapping("/edit")
    public String edit(CustomerVisit customervisit) {
        System.out.println(customervisit);
        int modify = customervisit.getModify();
        if(modify==0){
            customervisitService.insert(customervisit);
        }else if(modify==1){
            customervisitService.update(customervisit);
        }
        return "";
    }
    //    通过id查找
    @ResponseBody
    @RequestMapping("/getById")
    public CustomerVisit getById(Integer id) {
        System.out.println(id);
        return customervisitService.getById(id);
    }
    //    删除
    @ResponseBody
    @RequiresPermissions("cusDel")
    @RequestMapping("/delete")
    public int delete(Integer cusid) {
        return customervisitService.delete(cusid);
    }
}
