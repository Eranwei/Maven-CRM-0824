package com.model;

public class CustomerShare {
    private Integer id;
    private Integer cusId;
    private Integer empid;



    public CustomerShare(Integer id, Integer cusId, Integer empid) {
        this.id = id;
        this.cusId = cusId;
        this.empid = empid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        return "CustomerShare{" +
                "id=" + id +
                ", cusId=" + cusId +
                ", empid=" + empid +
                '}';
    }
}
