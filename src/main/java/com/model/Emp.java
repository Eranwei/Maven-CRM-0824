package com.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;


@JsonIgnoreProperties(value = { "handler"})
public class Emp implements Serializable {
    private int empno;
    private String ename;
    private double sal;



    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }


    public Emp(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
        System.out.println("Emp有参构造器");
    }

    public Emp(int empno, String ename, double sal) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
    }

    public Emp() {
       System.out.println("Empw构造器");
    }

    public Emp(String ename) {
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
        //System.out.println(ename);
    }

    //统计toString方法运行时间
    @Override
    public String toString() {
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //int a= 5/0;
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                '}';
    }
}
