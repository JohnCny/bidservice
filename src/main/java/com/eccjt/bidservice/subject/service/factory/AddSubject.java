package com.eccjt.bidservice.subject.service.factory;

import com.eccjt.bidservice.bidhistory.model.BidHistory;

/**
 * 加价
 */
public class AddSubject extends SubjectRule {
    @Override
    Boolean checkBestBid(BidHistory newBidHistory, BidHistory currentBidHistory) {
        if(newBidHistory.getBidPrice()>currentBidHistory.getBidPrice())
            return true;

        return false;
    }
}
