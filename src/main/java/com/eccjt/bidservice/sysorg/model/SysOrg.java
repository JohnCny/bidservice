package com.eccjt.bidservice.sysorg.model;

public class SysOrg {
    private String id;

    private String orgName;

    private String presentOrg;

    private String orgToken;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getPresentOrg() {
        return presentOrg;
    }

    public void setPresentOrg(String presentOrg) {
        this.presentOrg = presentOrg == null ? null : presentOrg.trim();
    }

    public String getOrgToken() {
        return orgToken;
    }

    public void setOrgToken(String orgToken) {
        this.orgToken = orgToken == null ? null : orgToken.trim();
    }
}