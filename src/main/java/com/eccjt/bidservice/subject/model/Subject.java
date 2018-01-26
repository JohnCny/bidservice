package com.eccjt.bidservice.subject.model;

import com.alibaba.fastjson.annotation.JSONField;


import java.io.Serializable;
import java.util.Date;

public class Subject implements Serializable{

    private String id;

    private Integer bidInterval;

    private Integer bidLadder;

    private String bidType;

    private String bidRoom;

    @JSONField(format="yyyy-MM-dd HH:mm:ss:SSS")
    private Date deadline;

    private String dealType;

    private Byte isBidStart;

    private Byte isBidBest;

    private Byte isRePrShown;

    private Byte isRounds;

    private Byte isPriority;

    private String manager;

    private String project;

    @JSONField(format="yyyy-MM-dd HH:mm:ss:SSS")
    private Date pauseTime;

    private Long reserverPrice;

    private Long securityDeposit;

    private Long startPrice;

    @JSONField(format="yyyy-MM-dd HH:mm:ss:SSS")
    private Date startTime;

    private String subjectName;

    private Byte subjectStatus;

    private String subjectRemark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getBidInterval() {
        return bidInterval;
    }

    public void setBidInterval(Integer bidInterval) {
        this.bidInterval = bidInterval;
    }

    public Integer getBidLadder() {
        return bidLadder;
    }

    public void setBidLadder(Integer bidLadder) {
        this.bidLadder = bidLadder;
    }

    public String getBidType() {
        return bidType;
    }

    public void setBidType(String bidType) {
        this.bidType = bidType == null ? null : bidType.trim();
    }

    public String getBidRoom() {
        return bidRoom;
    }

    public void setBidRoom(String bidRoom) {
        this.bidRoom = bidRoom == null ? null : bidRoom.trim();
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

    public Byte getIsBidStart() {
        return isBidStart;
    }

    public void setIsBidStart(Byte isBidStart) {
        this.isBidStart = isBidStart;
    }

    public Byte getIsBidBest() {
        return isBidBest;
    }

    public void setIsBidBest(Byte isBidBest) {
        this.isBidBest = isBidBest;
    }

    public Byte getIsRePrShown() {
        return isRePrShown;
    }

    public void setIsRePrShown(Byte isRePrShown) {
        this.isRePrShown = isRePrShown;
    }

    public Byte getIsRounds() {
        return isRounds;
    }

    public void setIsRounds(Byte isRounds) {
        this.isRounds = isRounds;
    }

    public Byte getIsPriority() {
        return isPriority;
    }

    public void setIsPriority(Byte isPriority) {
        this.isPriority = isPriority;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public Date getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(Date pauseTime) {
        this.pauseTime = pauseTime;
    }

    public Long getReserverPrice() {
        return reserverPrice;
    }

    public void setReserverPrice(Long reserverPrice) {
        this.reserverPrice = reserverPrice;
    }

    public Long getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(Long securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public Long getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Long startPrice) {
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
}