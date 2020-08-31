package com.dao;

import com.model.Customer;
import com.model.CustomerVisit;

import java.util.List;

public interface CustomervisitMapper {

    //    通过所有者查找
    List<CustomerVisit> empIdList(Integer empid);
    //    查找所有记录
    List<CustomerVisit> listAll();
    //   通过id查找
    CustomerVisit getById(Integer cusid);

    int delete(Integer id);

    int insert(CustomerVisit record);

    int update(CustomerVisit record);

}