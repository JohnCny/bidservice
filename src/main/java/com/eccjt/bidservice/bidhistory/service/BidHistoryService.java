package com.eccjt.bidservice.bidhistory.service;

import com.eccjt.bidservice.bidhistory.model.BidHistory;

public interface BidHistoryService {

    /**
     * 新报价
     * @param bidHistory
     * @return
     */
    Integer createBidHistory(BidHistory bidHistory);



}
