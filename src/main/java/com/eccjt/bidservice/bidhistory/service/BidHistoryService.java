package com.eccjt.bidservice.bidhistory.service;

public interface BidHistoryService {

    /**
     * 新报价
     * @param userId
     * @param price
     * @param subjectId
     * @return
     */
    Integer newBid(Long price,String subjectId);


}
