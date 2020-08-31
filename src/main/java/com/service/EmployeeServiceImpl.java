package com.service;

import com.dao.EmployeeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Emp;
import com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService  {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> list(Employee emp) {
        return employeeMapper.list(emp);
    }

    @Override
    public Employee getById(Integer empid) {
        return employeeMapper.getById(empid);
    }

    @Override
    public Employee getByUserName(String userName) {
        return employeeMapper.getByUserName(userName);
    }

    @Override
    public int del(Integer empid) {
        return employeeMapper.delete(empid);
    }

    @Override
    public int add(Employee record) {
        return employeeMapper.insert(record);
    }

    @Override
    public int modifyall( ) {
        return employeeMapper.modifyall();
    }

    @Override
    public int edit(Employee record) {
        return employeeMapper.insert(record);
    }

    @Override
    public int update(Employee record) {
        return employeeMapper.update(record);
    }

    @Override
    public PageInfo<Employee> pageList(Employee emp, int pageNum, int size) {
        PageHelper.startPage(pageNum,size);
        List<Employee> emps = employeeMapper.list(emp);
        PageInfo<Employee> pageInfo = new PageInfo<>(emps);
        return pageInfo;
    }
}
