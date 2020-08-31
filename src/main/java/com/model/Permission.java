package com.model;

public class Permission {
    private Integer permid;

    private String purl;

    private String pname;

    private Integer ismenu;

    private Integer parentId;

    private String pinfo;

    public Integer getPermid() {
        return permid;
    }

    public void setPermid(Integer permid) {
        this.permid = permid;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl == null ? null : purl.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(Integer ismenu) {
        this.ismenu = ismenu;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPinfo() {
        return pinfo;
    }

    public void setPinfo(String pinfo) {
        this.pinfo = pinfo == null ? null : pinfo.trim();
    }

    public Permission(Integer permid, String purl, String pname, Integer ismenu, Integer parentId, String pinfo) {
        this.permid = permid;
        this.purl = purl;
        this.pname = pname;
        this.ismenu = ismenu;
        this.parentId = parentId;
        this.pinfo = pinfo;
    }

    public Permission(String purl, String pname, Integer ismenu, Integer parentId, String pinfo) {
        this.purl = purl;
        this.pname = pname;
        this.ismenu = ismenu;
        this.parentId = parentId;
        this.pinfo = pinfo;
    }

    public Permission() {
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + permid +
                ", url='" + purl + '\'' +
                ", pname='" + pname + '\'' +
                ", ismenu=" + ismenu +
                ", parentid=" + parentId +
                ", pinfo='" + pinfo + '\'' +
                '}';
    }
}