package com.service;

import com.dao.CustomervisitMapper;
import com.model.CustomerVisit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("customervisitService")
public class CustomervisitServiceImpl implements CustomervisitService{
    @Autowired
    private CustomervisitMapper customervisitMapper;
    @Override
    public List<CustomerVisit> empIdList(Integer empid) {
        return customervisitMapper.empIdList(empid);
    }

    @Override
    public List<CustomerVisit> listAll() {
        return customervisitMapper.listAll();
    }

    @Override
    public CustomerVisit getById(Integer cusid) {
        return customervisitMapper.getById(cusid);
    }

    @Override
    public int delete(Integer id) {
        return customervisitMapper.delete(id);
    }

    @Override
    public int insert(CustomerVisit record) {
        return customervisitMapper.insert(record);
    }

    @Override
    public int update(CustomerVisit record) {
        return customervisitMapper.update(record);
    }
}
