package com.eccjt.bidservice.subject.service.factory;

import com.eccjt.bidservice.bidhistory.model.BidHistory;
import com.eccjt.bidservice.subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 一次性
 */
public class OnceSubject extends SubjectRule{
    @Autowired
    private SubjectService subjectService;

    @Override
    Boolean checkBestBid(BidHistory newBidHistory, BidHistory currentBidHistory) {
        String dealType=subjectService.findSubjectById(newBidHistory.getSubject()).getDealType();
        if(dealType.equals("H"))//以最高价成交
            if(newBidHistory.getBidPrice()>currentBidHistory.getBidPrice())
                return true;
        else if (dealType.equals("L"))//以最低价成交
            if (newBidHistory.getBidPrice()<currentBidHistory.getBidPrice())
                return true;
        return true;
    }
}
