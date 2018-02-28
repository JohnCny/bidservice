package com.eccjt.bidservice.bidhistory.service.impl;


import com.eccjt.bidservice.bidhistory.dao.BidHistoryMapper;
import com.eccjt.bidservice.bidhistory.model.BestPriceRecord;

import com.eccjt.bidservice.bidhistory.model.BidHistory;

import com.eccjt.bidservice.bidhistory.service.BestPriceRecordService;
import com.eccjt.bidservice.bidhistory.service.BidHistoryService;

import com.eccjt.bidservice.subject.model.Subject;
import com.eccjt.bidservice.subject.service.SubjectService;
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

    @Autowired
    private SubjectService subjectService;

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
        //获取标的
        Subject subject= subjectService.findSubjectById(bidHistory.getSubject());
        //无记录，版本号置1
        if(bestPriceRecords.size()==0){
            //版本号置1
            bestPriceRecord.setVersion(1);
            bprResult=bestPriceRecordService.createBestPriceRecord(bestPriceRecord);

        }
        else {
            BestPriceRecord currentBestPrice = bestPriceRecords.get(0);

            Boolean checkResult;

            if (subject.getBidType().equals("O") && subject.getDealType().equals("U")){
                //一次性竞价且不以成交结果成交不判断最优价
                checkResult=true;
            }
            else {
                //获取竞价规则，根据竞价规则比较当前报价与最优价
                BidHistory currentBidHistory = bidHistoryMapper.selectByPrimaryKey(currentBestPrice.getBestBidhistory());
                checkResult = subjectService.checkBestPrice(bidHistory, currentBidHistory);
            }

            //是最优价格，更新最优报价
            if(checkResult) {
                bestPriceRecord.setVersion(currentBestPrice.getVersion() + 1);//版本号+1
                bprResult = bestPriceRecordService.updateBestPriceRecord(bestPriceRecord);
            }
        }

        if(bprResult==1){
            //结果=1,最优价更新成功,更新缓存
            operations.set(redisKey,bidHistory);
        }
        //更新竞价历史记录
        Integer result=bidHistoryMapper.insert(bidHistory);

        //报价成功，项目是荷兰式直接终止
        if (result==1){
            if (subject.getBidType().equals("D")){
                //状态置为-1
                subject.setSubjectStatus((byte)-1);
                subjectService.updateSubject(subject);
            }
        }

        return result;
    }


}
