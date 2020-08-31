package com.dao;

import com.model.Emp;

import java.util.List;

public interface EmpDao {

    public List<Emp> list(Emp emp);
    public Emp getEmpById(int empno);

    public void add(Emp emp);
    public void edit(Emp emp);
    public void del(Emp emp);



}
