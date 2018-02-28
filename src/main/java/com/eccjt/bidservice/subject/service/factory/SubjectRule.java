package com.eccjt.bidservice.subject.service.factory;

import com.eccjt.bidservice.bidhistory.model.BidHistory;
import com.eccjt.bidservice.subject.model.Subject;
import com.eccjt.bidservice.subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class SubjectRule {

    @Autowired
    private SubjectService subjectService;
    /**
     *  判断报价是否是最优报价
     * @param newBidHistory,currentBidHistory
     * @return
     */
    abstract Boolean checkBestBid(BidHistory newBidHistory,BidHistory currentBidHistory);

}
