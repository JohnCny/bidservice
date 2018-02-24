package com.eccjt.bidservice.syspermission.model;

public class SysPermission {
    private String id;

    private String primission;

    private String description;

    private Byte available;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPrimission() {
        return primission;
    }

    public void setPrimission(String primission) {
        this.primission = primission == null ? null : primission.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getAvailable() {
        return available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
    }
}