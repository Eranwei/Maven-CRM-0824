package com.service;

import com.github.pagehelper.PageInfo;
import com.model.Emp;

public interface EmpService {

    public PageInfo<Emp> list(Emp emp, int pageNum, int size);


    public Emp  getEmpById(int empno);

    public void add(Emp emp);
    public void edit(Emp emp);
    public void del(Emp emp);
}
