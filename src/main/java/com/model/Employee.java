package com.model;

public class Employee {
    private Integer empid;

    private String userName;

    private String userPassword;

    private String tel;

    private String empName;

    private String email;

    private Integer roleId;

    private String roleInfo;

    private Role role;

    public String getRoleInfo() {
        return roleInfo;
    }

    public Employee(Integer empid, String userName, String userPassword, String tel, String empName, String email, Integer roleId, String roleInfo, Role role) {
        this.empid = empid;
        this.userName = userName;
        this.userPassword = userPassword;
        this.tel = tel;
        this.empName = empName;
        this.email = email;
        this.roleId = roleId;
        this.roleInfo = roleInfo;
        this.role = role;
    }

    public Employee(Integer empid, String userName) {
        this.empid = empid;
        this.userName = userName;
    }

    public Employee() {
    }

    public Employee(Integer empid, String userName, String userPassword, String tel, String empName, String email, Integer roleId, String roleInfo) {
        this.empid = empid;
        this.userName = userName;
        this.userPassword = userPassword;
        this.tel = tel;
        this.empName = empName;
        this.email = email;
        this.roleId = roleId;
        this.roleInfo = roleInfo;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setRoleInfo(String roleInfo) {
        this.roleInfo = roleInfo;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", tel='" + tel + '\'' +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", roleId=" + roleId +
                ", roleInfo='" + roleInfo + '\'' +
                ", role=" + role +
                '}';
    }

    public void setEmpid() {
    }
}