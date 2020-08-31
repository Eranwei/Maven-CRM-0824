package com.service;

import com.github.pagehelper.PageInfo;
import com.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> list(Employee emp);
    Employee getById(Integer empid);
    Employee getByUserName(String userName);


    int del(Integer empid);
    int add(Employee record);
    int modifyall();
    int edit(Employee record);
    int update(Employee record);
    PageInfo<Employee> pageList(Employee emp, int pageNum, int size);
}
