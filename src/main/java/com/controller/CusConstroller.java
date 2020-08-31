package com.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.CusShareModel;
import com.model.Customer;
import com.model.Employee;
import com.service.CusService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cus")
@ResponseBody
public class CusConstroller {
    @Autowired
    CusService cusService;

    @RequiresPermissions("cusUpdate")
    @RequestMapping("/list")
    public Map list1(int pageNum, int size){
        System.out.println(cusService);
        PageHelper.startPage(pageNum,size);
        List<Customer> list = cusService.list();
        PageInfo<Customer> pageInfo = new PageInfo<>(list);

        Map map = new HashMap();
        List<Customer> cus1 = pageInfo.getList();
        map.put("cus",cus1);
        map.put("rowCount",pageInfo.getTotal());
        map.put("pageCount",pageInfo.getPages());
        return map;
    }

    @RequestMapping("/listById")
    public Map listById(int pageNum, int size){
        Subject sb= SecurityUtils.getSubject();
        Employee ep = (Employee) sb.getPrincipal();

        PageHelper.startPage(pageNum,size);
        List<Customer> list = cusService.listById(ep.getEmpid());
        PageInfo<Customer> pageInfo = new PageInfo<>(list);

        Map map = new HashMap();
        List<Customer> cus1 = pageInfo.getList();
        map.put("cus",cus1);
        map.put("rowCount",pageInfo.getTotal());
        map.put("pageCount",pageInfo.getPages());
        return map;
    }


    @RequestMapping("/shareById")
    public List<CusShareModel> shareByID(){
        Subject sb= SecurityUtils.getSubject();
        Employee ep = (Employee) sb.getPrincipal();
        return cusService.shareById(ep.getEmpid());
    }


    @RequestMapping("/share")
    public  List<CusShareModel> selectShare(){
        return cusService.selectShare();
    }
////    新增员工
//    @RequestMapping("/edit")
//    public boolean edit(Customer cus,int modify){
//        if(modify==0){
//            cusService.insert(cus);
//            System.out.println(cus.toString());
//        }else if(modify==1){
//            cusService.
//        }
//
//        return true;
//


//testingGit


    @RequiresPermissions("cusUpdate")
    @RequestMapping("/update")
    public boolean update(Customer cus,int modify){
        if(modify==0){
            cusService.update(cus);
        }else if(modify==1){
            cusService.insert(cus);
        }
        return true;
    }

    @RequiresPermissions("cusInsert")
    @RequestMapping("/addShare")
    public int addShare(Integer cusid,Integer empid){
        cusService.addShare(new CusShareModel(cusid,empid));
        return 0;
    }




    @RequiresPermissions("cusDel")
    @RequestMapping("/del")
    public boolean del(Integer cus){
        System.out.println(cus);
        cusService.delete(cus);
        return true;
    }

    @RequiresPermissions("cusDel")
    @RequestMapping("/delshare")
    public boolean delshare(int id){
        cusService.deleteShare(id);
        return true;
    }

    @RequiresPermissions("cusInsert")
    @RequestMapping("/add")
    public int insert(Customer cus){
        System.out.println(cus);
        cusService.insert(cus);
        return 0;
    }

    @RequestMapping("/getById")
    public boolean getById(Integer id,Integer empid){
        cusService.updateCusid(new CusShareModel(id,0,empid));
        return true;
    }


}
