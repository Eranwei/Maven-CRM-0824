package com.test;

import com.dao.EmployeeMapper;
import com.model.CusShareModel;
import com.model.Customer;
import com.model.CustomerVisit;
import com.model.Employee;
import com.service.CusService;
import com.service.CustomervisitService;
import com.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-test.xml");
        System.out.println(ac.getBean("employeeMapper"));
        CustomervisitService cusService = (CustomervisitService) ac.getBean("customervisitService");
        //cusid, empid,
        //      content, date



//      Date date =new Date();
//        CustomerVisit cusV=new CustomerVisit(1,1,1,"test",date,0);
//        cusService.insert(cusV);
//
//        List<CustomerVisit> customerVisits = cusService.empIdList(1);
//        for (CustomerVisit customerVisit : customerVisits) {
//            System.out.println(customerVisit
//            );
//        }


        //测试DAO
        //CusService cusService = (CusService) ac.getBean("cusService");


       // (Integer cusid, String cusName, String address, String contact, String tel, String email)

//        Customer custest=new Customer(1,"cusName","123163","465465");

        //    cusService.addShare(1,4);


//        List<Customer> lists = cusService.list();
//        for (Customer list : lists) {
//            System.out.println(list);
//        }


        //测试新增
//测试新增cusService      测试新增  Employee emp = new Employee();
//        emp.setUserName("admin2");
//        emp.setUserPassword("1234");
//        emp.setTel("12347");
//        emp.setRoleid(0);
//        emp.setEmpName("eran");
//        emp.setEmpid();
//        emp.setEmail("a");
//        empMapper.insert(emp);
//
//        List<Employee> emps = empMapper.list(null);
//        for (Employee emp2 : emps) {
//            System.out.println(emp2);
//        }
//
//        //测试Service
//        EmployeeService employeeService = (EmployeeService) ac.getBean("employeeService");
//        /*System.out.println(employeeService);
//        List<Employee> emps = employeeService.list(null);
//        for (Employee emp : emps) {
//            System.out.println(emp);
//        }*/
        //通过用户名查找




    }
}
