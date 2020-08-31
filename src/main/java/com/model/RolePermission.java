package com.model;

public class RolePermission {
    private Integer id;
    private Integer roleId;
    private Integer permid;

    public RolePermission(Integer id, Integer roleId, Integer permissionId) {
        this.id = id;
        this.roleId = roleId;
        this.permid = permissionId;
    }

    public RolePermission(Integer roleId, Integer permissionId) {
        this.roleId = roleId;
        this.permid = permissionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermid() {
        return permid;
    }

    public void setPermid(Integer permid) {
        this.permid = permid;
    }

    public RolePermission() {
    }

    @Override
    public String toString() {
        return "RolePermission{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", permissionId=" + permid +
                '}';
    }
}
