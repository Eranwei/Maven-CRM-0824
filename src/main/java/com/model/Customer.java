package com.model;

public class Customer {
    private Integer cusid;
    private String cusName;
    private String address;
    private String contact;
    private String tel;
    private String email;

    public Customer(Integer cusid, String cusName, String address, String contact, String tel, String email) {
        this.cusid = cusid;
        this.cusName = cusName;
        this.address = address;
        this.contact = contact;

        this.tel = tel;
        this.email = email;
    }



    public Customer(){super();}

    public Customer(Integer id,String cusName, String tel, String email) {
        this.cusid=id;
        this.cusName = cusName;
        this.tel = tel;
        this.email = email;
    }

    public Customer(String cusName, String tel) {
        this.cusName = cusName;
        this.tel = tel;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusid=" + cusid +
                ", cusName='" + cusName + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
