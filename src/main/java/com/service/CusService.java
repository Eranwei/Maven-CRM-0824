package com.service;

import com.github.pagehelper.PageInfo;
import com.model.CusShareModel;
import com.model.Customer;
import com.model.Emp;
import com.sun.deploy.xml.CustomParser;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

public interface CusService {

    List<Customer> list();
    List<Customer> listById(int empid);

    Customer getById(int cusid);
    Customer getByCusName(String cusName);
    public int insert(Customer cus);
    public int update(Customer cus);
    public int delete(Integer cusid);
    public int addShare(CusShareModel cusShareModel);
    List<CusShareModel> selectShare();
    void updateCusid(CusShareModel cusShareModel);
    void deleteShare(int id);
    List shareById(int empid);
}
