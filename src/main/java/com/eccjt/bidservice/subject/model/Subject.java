package com.eccjt.bidservice.subject.model;

import java.io.Serializable;

/**
 * Created by johhny on 17/10/18.
 */
public class Subject implements Serializable{

    private Long id;

    /**
     * 规则编号
     */
    private Long rule;
    /**
     * 竞价方式
     */
    private String bidType;
    /**
     * 竞价阶梯
     */
    private Integer bidLadder;
    /**
     * 截止时间
     */
    private String deadline;
    /**
     * 成交方式
     */
    private Integer dealType;
    /**
     * 延时竞价期
     */
    private Integer bidInterval;
    /**
     * 保留价
     */
    private Double reserverPrice;
    /**
     * 起始价
     */
    private Double startPrice;
    /**
     * 开始时间
     */
    private String startTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRule() {
        return rule;
    }

    public void setRule(Long rule) {
        this.rule = rule;
    }

    public String getBidType() {
        return bidType;
    }

    public void setBidType(String bidType) {
        this.bidType = bidType;
    }

    public Integer getBidLadder() {
        return bidLadder;
    }

    public void setBidLadder(Integer bidLadder) {
        this.bidLadder = bidLadder;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Integer getDealType() {
        return dealType;
    }

    public void setDealType(Integer dealType) {
        this.dealType = dealType;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
