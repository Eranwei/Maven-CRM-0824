package com.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
public class CustomerVisit {
    private Integer id;

    private Integer cusid;

    private Integer empid;

    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date ;

    private int modify;

    public int getModify() {
        return modify;
    }

    public void setModify(int modify) {
        this.modify = modify;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CustomerVisit() {
    }

    public CustomerVisit(Integer id, Integer cusid, Integer empid, String content, int modify) {
        this.id = id;
        this.cusid = cusid;
        this.empid = empid;
        this.content = content;
        this.modify = modify;
    }

    public CustomerVisit(Integer id, Integer cusid, Integer empid, String content, Date date, int modify) {
        this.id = id;
        this.cusid = cusid;
        this.empid = empid;
        this.content = content;
        this.date = date;
        this.modify = modify;
    }

    @Override
    public String toString() {
        return "Customervisit{" +
                "id=" + id +
                ", cusid=" + cusid +
                ", empid=" + empid +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", modify=" + modify +
                '}';
    }
}
