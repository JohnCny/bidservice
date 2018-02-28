package com.eccjt.bidservice.subject.service.factory;

import com.eccjt.bidservice.bidhistory.model.BidHistory;

/**
 * 荷兰式
 */
public class DutchSubject extends SubjectRule{
    @Override
    Boolean checkBestBid(BidHistory newBidHistory, BidHistory currentBidHistory) {
        return true;
    }
}
