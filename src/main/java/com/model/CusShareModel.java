package com.model;

public class CusShareModel {
    private int id;
    private Integer cusid;
    private String cusName;
    private Integer empid;
    private String empName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CusShareModel(int id, Integer cusid, Integer empid) {
        this.id = id;
        this.cusid = cusid;
        this.empid = empid;
    }

    public CusShareModel(Integer cusid, String cusName, Integer empid, String empName) {
        this.cusid = cusid;
        this.cusName = cusName;
        this.empid = empid;
        this.empName = empName;
    }

    public CusShareModel(Integer cusid, Integer empid) {
        this.cusid = cusid;
        this.empid = empid;
    }


    public CusShareModel() {
    }

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "CusShareModel{" +
                "cusid=" + cusid +
                ", cusName='" + cusName + '\'' +
                ", empid=" + empid +
                ", empName='" + empName + '\'' +
                '}';
    }
}
