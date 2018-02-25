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
    public Integer createBidHistory(BidHistory bidHistory) {
        //todo:获取用户ID
        String userId="todo_userid";

        //开始获取最优报价
        //查询redis是否有相应键值对


        return null;
    }
}
