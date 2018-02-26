package com.eccjt.bidservice.bidhistory.service.impl;


import com.eccjt.bidservice.bidhistory.dao.BidHistoryMapper;
import com.eccjt.bidservice.bidhistory.model.BestPriceRecord;

import com.eccjt.bidservice.bidhistory.model.BidHistory;

import com.eccjt.bidservice.bidhistory.service.BestPriceRecordService;
import com.eccjt.bidservice.bidhistory.service.BidHistoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BidHistoryServiceImpl implements BidHistoryService{

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private BidHistoryMapper bidHistoryMapper;

    @Autowired
    private BestPriceRecordService bestPriceRecordService;

    @Override
    @Transactional
    public Integer createBidHistory(BidHistory bidHistory){
        //todo:获取用户ID
        String userId="todo_userid";

        //最优价格更新结果
        Integer bprResult=0;

        //缓存KEY及操作初始化
        String redisKey="bestPrice_"+bidHistory.getSubject();
        ValueOperations<String,BidHistory> operations=redisTemplate.opsForValue();

        //最优报价数据初始化
        BestPriceRecord bestPriceRecord=new BestPriceRecord();
        bestPriceRecord.setBestBidhistory(bidHistory.getId());
        bestPriceRecord.setSubject(bidHistory.getSubject());


        //开始获取最优报价
        List<BestPriceRecord> bestPriceRecords= bestPriceRecordService.getBestPriceBySubject(bidHistory.getSubject());

        //无记录，版本号置1
        if(bestPriceRecords.size()==0){
            //版本号置1
            bestPriceRecord.setVersion(1);
            bprResult=bestPriceRecordService.createBestPriceRecord(bestPriceRecord);
        }
        else {
            BestPriceRecord currentBestPrice = bestPriceRecords.get(0);

            //获取竞价规则，根据竞价规则比较当前报价与最优价

            //是最优价格，更新最优报价
            //更新版本号
            bestPriceRecord.setVersion(currentBestPrice.getVersion()+1);
            bprResult=bestPriceRecordService.updateBestPriceRecord(bestPriceRecord);
        }

        if(bprResult==1){
            //结果=1,最优价更新成功,更新缓存
            operations.set(redisKey,bidHistory);
        }

        //更新竞价历史记录
        return bidHistoryMapper.insert(bidHistory);
    }


}
