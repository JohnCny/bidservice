package com.eccjt.bidservice.bidapply.model;

import java.io.Serializable;
import java.util.Date;

public class BidApply implements Serializable {
    private String id;

    private Byte applyStatus;

    private String bidUser;

    private Long payedSecDep;

    private String bidRoom;

    private String subject;

    private Date createDate;

    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Byte getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Byte applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getBidUser() {
        return bidUser;
    }

    public void setBidUser(String bidUser) {
        this.bidUser = bidUser == null ? null : bidUser.trim();
    }

    public Long getPayedSecDep() {
        return payedSecDep;
    }

    public void setPayedSecDep(Long payedSecDep) {
        this.payedSecDep = payedSecDep;
    }

    public String getBidRoom() {
        return bidRoom;
    }

    public void setBidRoom(String bidRoom) {
        this.bidRoom = bidRoom == null ? null : bidRoom.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}