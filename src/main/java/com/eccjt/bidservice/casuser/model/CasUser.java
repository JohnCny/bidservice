package com.eccjt.bidservice.casuser.model;

public class CasUser {
    private String id;

    private String casUserName;

    private String sysUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCasUserName() {
        return casUserName;
    }

    public void setCasUserName(String casUserName) {
        this.casUserName = casUserName == null ? null : casUserName.trim();
    }

    public String getSysUser() {
        return sysUser;
    }

    public void setSysUser(String sysUser) {
        this.sysUser = sysUser == null ? null : sysUser.trim();
    }
}