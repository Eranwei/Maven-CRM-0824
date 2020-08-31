package com.service;

import com.dao.CustomerMapper;
import com.dao.EmployeeMapper;
import com.github.pagehelper.PageInfo;
import com.model.CusShareModel;
import com.model.Customer;
import com.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cusService")
public class CusServiceImpl implements CusService  {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<CusShareModel> selectShare() {
        return customerMapper.selectShare();
    }

    @Override
    public void updateCusid(CusShareModel cusShareModel) {
        customerMapper.updateCusid(cusShareModel);
    }

    @Override
    public void deleteShare(int id) {
        customerMapper.deleteShare(id);
    }

    @Override
    public List<Customer> list() {
        return customerMapper.list();
    }

    @Override
    public List shareById(int empid) {
        return customerMapper.shareById(empid);
    }

    @Override
    public List<Customer> listById(int empid) {
        return customerMapper.listById(empid);
    }

    @Override
    public Customer getById(int cusid) {
        return customerMapper.getById(cusid);
    }

    @Override
    public Customer getByCusName(String cusName){
        return customerMapper.getByCusName(cusName);
    };

    @Override
    public int delete(Integer cusid) {
        return customerMapper.delete(cusid);
    }

    @Override
    public int addShare(CusShareModel cusShareModel) {
        return customerMapper.addShare(cusShareModel);
    }

    public int insert(Customer cus){
        return customerMapper.insert(cus);
    }
    @Override
    public int update(Customer cus) {
        return customerMapper.update(cus);
    }








}
