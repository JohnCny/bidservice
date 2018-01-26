package com.eccjt.bidservice.bidhistory.model;

import java.util.Date;

public class BidHistory {
    private String id;

    private String bidUser;

    private Date bidTime;

    private Long bidPrice;

    private Byte isPriorityUsed;

    private Byte priorityLevel;

    private Byte isBestPrice;

    private String subject;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBidUser() {
        return bidUser;
    }

    public void setBidUser(String bidUser) {
        this.bidUser = bidUser == null ? null : bidUser.trim();
    }

    public Date getBidTime() {
        return bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public Long getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Long bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Byte getIsPriorityUsed() {
        return isPriorityUsed;
    }

    public void setIsPriorityUsed(Byte isPriorityUsed) {
        this.isPriorityUsed = isPriorityUsed;
    }

    public Byte getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(Byte priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public Byte getIsBestPrice() {
        return isBestPrice;
    }

    public void setIsBestPrice(Byte isBestPrice) {
        this.isBestPrice = isBestPrice;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}