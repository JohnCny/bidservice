package com.eccjt.bidservice.subject.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Date;

public class Subject implements Serializable{
    private Integer id;

    private Integer bidRule;

    private Integer bidType;

    private Integer bidLadder;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date deadline;

    private String dealType;

    private Integer bidInterval;

    private Double reserverPrice;

    private Double startPrice;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    private String subjectName;

    private Byte subjectStatus;

    private String subjectRemark;

    private Integer projectId;

    private Boolean isStartPrice;

    private Boolean isReserverPriceShown;

    private Byte isBestPriceBid;

    private Boolean isMultiRound;

    private String uuid;

    private Integer biddingOffice;

    private Double earnestMoney;

    private Boolean isPriority;

    private Integer manager;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBidRule() {
        return bidRule;
    }

    public void setBidRule(Integer bidRule) {
        this.bidRule = bidRule;
    }

    public Integer getBidType() {
        return bidType;
    }

    public void setBidType(Integer bidType) {
        this.bidType = bidType;
    }

    public Integer getBidLadder() {
        return bidLadder;
    }

    public void setBidLadder(Integer bidLadder) {
        this.bidLadder = bidLadder;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType == null ? null : dealType.trim();
    }

    public Integer getBidInterval() {
        return bidInterval;
    }

    public void setBidInterval(Integer bidInterval) {
        this.bidInterval = bidInterval;
    }

    public Double getReserverPrice() {
        return reserverPrice;
    }

    public void setReserverPrice(Double reserverPrice) {
        this.reserverPrice = reserverPrice;
    }

    public Double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Double startPrice) {
        this.startPrice = startPrice;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public Byte getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(Byte subjectStatus) {
        this.subjectStatus = subjectStatus;
    }

    public String getSubjectRemark() {
        return subjectRemark;
    }

    public void setSubjectRemark(String subjectRemark) {
        this.subjectRemark = subjectRemark == null ? null : subjectRemark.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Boolean getIsStartPrice() {
        return isStartPrice;
    }

    public void setIsStartPrice(Boolean isStartPrice) {
        this.isStartPrice = isStartPrice;
    }

    public Boolean getIsReserverPriceShown() {
        return isReserverPriceShown;
    }

    public void setIsReserverPriceShown(Boolean isReserverPriceShown) {
        this.isReserverPriceShown = isReserverPriceShown;
    }

    public Byte getIsBestPriceBid() {
        return isBestPriceBid;
    }

    public void setIsBestPriceBid(Byte isBestPriceBid) {
        this.isBestPriceBid = isBestPriceBid;
    }

    public Boolean getIsMultiRound() {
        return isMultiRound;
    }

    public void setIsMultiRound(Boolean isMultiRound) {
        this.isMultiRound = isMultiRound;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getBiddingOffice() {
        return biddingOffice;
    }

    public void setBiddingOffice(Integer biddingOffice) {
        this.biddingOffice = biddingOffice;
    }

    public Double getEarnestMoney() {
        return earnestMoney;
    }

    public void setEarnestMoney(Double earnestMoney) {
        this.earnestMoney = earnestMoney;
    }

    public Boolean getIsPriority() {
        return isPriority;
    }

    public void setIsPriority(Boolean isPriority) {
        this.isPriority = isPriority;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }
}