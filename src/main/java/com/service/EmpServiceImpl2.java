package com.service;

import com.dao.EmpDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service("empService")
public class EmpServiceImpl2  implements EmpService {
    //使用编程式事务
/*    @Autowired
    TransactionTemplate transactionTemplate;*/

    @Autowired
    private EmpDao empDao;

    @Override
    public PageInfo<Emp> list(Emp emp, int pageNum, int size) {
        PageHelper.startPage(pageNum,size);
        List<Emp> emps = empDao.list(new Emp(0, ""));
        PageInfo<Emp> pageInfo = new PageInfo<>(emps);
        return pageInfo;
    }

    @Override
    public Emp getEmpById(int empno) {
        return empDao.getEmpById(empno);
    }


   //声明式事务-注解使用
    @Transactional
    @Override
    public void add(Emp emp) {
        empDao.add(emp);
    }


    @Override
    public void edit(Emp emp) {
        empDao.edit(emp);
    }

    @Override
    public void del(Emp emp) {
        empDao.del(emp);
    }
}
