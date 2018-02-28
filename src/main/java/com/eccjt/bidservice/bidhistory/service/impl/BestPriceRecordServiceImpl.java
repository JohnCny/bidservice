package com.eccjt.bidservice.bidhistory.service.impl;

import com.eccjt.bidservice.bidhistory.dao.BestPriceRecordMapper;
import com.eccjt.bidservice.bidhistory.model.BestPriceRecord;
import com.eccjt.bidservice.bidhistory.model.BestPriceRecordExample;
import com.eccjt.bidservice.bidhistory.service.BestPriceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by johhny on 18/2/26.
 */
@Service
public class BestPriceRecordServiceImpl implements BestPriceRecordService {
    @Autowired
    private BestPriceRecordMapper bestPriceRecordMapper;

    @Override
    public Integer createBestPriceRecord(BestPriceRecord bestPriceRecord) {
        //获得该标的当前最优报价
        BestPriceRecordExample bestPriceRecordExample=new BestPriceRecordExample();
        bestPriceRecordExample.createCriteria().andSubjectEqualTo(bestPriceRecord.getSubject());

        List<BestPriceRecord> bestPriceRecordList=bestPriceRecordMapper.selectByExample(bestPriceRecordExample);

        //有记录,update
        if (bestPriceRecordList.size()>0) {
            return updateBestPriceRecord(bestPriceRecord);
        }
        else
        {
            return bestPriceRecordMapper.insert(bestPriceRecord);
        }
    }

    @Override
    public Integer updateBestPriceRecord(BestPriceRecord bestPriceRecord) {
        //获得该标的当前最优报价
        BestPriceRecordExample bestPriceRecordExample=new BestPriceRecordExample();
        bestPriceRecordExample.createCriteria().andSubjectEqualTo(bestPriceRecord.getSubject());

        List<BestPriceRecord> bestPriceRecordList=bestPriceRecordMapper.selectByExample(bestPriceRecordExample);

        BestPriceRecord currentBestPrice=bestPriceRecordList.get(0);

        if (bestPriceRecord.getVersion()>=(currentBestPrice.getVersion()+1)){
            //版本号大于等于当前的版本+1,版本正确,可以更新,版本号小于当前版本,不做任何操作,返回0
            return bestPriceRecordMapper.updateByPrimaryKey(bestPriceRecord);
        }
        else{
            return 0;
        }
    }

    @Override
    public List<BestPriceRecord> getBestPriceBySubject(String subjectId) {
        //获得该标的当前最优报价
        BestPriceRecordExample bestPriceRecordExample=new BestPriceRecordExample();
        bestPriceRecordExample.createCriteria().andSubjectEqualTo(subjectId);

        return bestPriceRecordMapper.selectByExample(bestPriceRecordExample);
    }
}
