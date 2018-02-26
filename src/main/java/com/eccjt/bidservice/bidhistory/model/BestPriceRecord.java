package com.eccjt.bidservice.bidhistory.model;

public class BestPriceRecord {
    private String id;

    private String bestBidhistory;

    private String subject;

    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBestBidhistory() {
        return bestBidhistory;
    }

    public void setBestBidhistory(String bestBidhistory) {
        this.bestBidhistory = bestBidhistory == null ? null : bestBidhistory.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}