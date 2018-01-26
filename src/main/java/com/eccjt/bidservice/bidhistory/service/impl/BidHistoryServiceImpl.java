package com.eccjt.bidservice.bidhistory.service.impl;

import com.eccjt.bidservice.bidhistory.model.BidHistory;
import com.eccjt.bidservice.bidhistory.model.BidHistoryExample;
import com.eccjt.bidservice.bidhistory.service.BidHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class BidHistoryServiceImpl implements BidHistoryService{

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Integer newBid(Long price, String subjectId) {
        //todo:获取用户ID
        String userId="todo_userid";

        //开始填充模型
        BidHistory bidHistory=new BidHistory();
        bidHistory.setBidUser(userId);
        bidHistory.setBidPrice(price);
        bidHistory.setSubject(subjectId);

        //开始获取最优报价
        //查询redis是否有相应键值对

        BidHistoryExample bidHistoryExample=new BidHistoryExample();
        bidHistoryExample.createCriteria().andSubjectEqualTo(subjectId).andIsBestPriceEqualTo((byte)1);

        return null;
    }
}
