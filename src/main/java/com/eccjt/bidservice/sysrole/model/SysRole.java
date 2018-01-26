package com.eccjt.bidservice.sysrole.model;

public class SysRole {
    private String id;

    private String roleName;

    private Byte roleLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Byte getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Byte roleLevel) {
        this.roleLevel = roleLevel;
    }
}