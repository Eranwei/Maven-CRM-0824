package com.dao;

import com.model.Employee;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> list(Employee emp);
    Employee getById(Integer empid);
    Employee getByUserName(String userName);

    int delete(Integer empid);
    int insert(Employee record);
    int update(Employee record);
    int modifyall();

}