package com.dao;

import com.model.CusShareModel;
import com.model.Customer;
import com.model.Employee;
import org.omg.CORBA.INTERNAL;

import java.util.List;

public interface CustomerMapper {

    List<Customer> list();
    List<Customer> listById(int empid);
    Customer getById(Integer cusid);
    Customer getByCusName(String cusName);

    List shareById(int empid);
    int addShare(CusShareModel cusShareModel);
    int delete(Integer cusid);
    int insert(Customer cus);
    int update(Customer cus);
    void updateCusid(CusShareModel cusShareModel);
    List<CusShareModel> selectShare();

    void deleteShare(int id);
}