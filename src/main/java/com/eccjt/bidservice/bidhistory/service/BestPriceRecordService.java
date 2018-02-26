package com.eccjt.bidservice.bidhistory.service;

import com.eccjt.bidservice.bidhistory.model.BestPriceRecord;

import java.util.List;

public interface BestPriceRecordService {


    /**
     * 新增最优报价记录
     * @param bestPriceRecord
     * @return
     */
    Integer createBestPriceRecord(BestPriceRecord bestPriceRecord);

    /**
     * 更新最优报价记录
     * @param bestPriceRecord
     * @return
     */
    Integer updateBestPriceRecord(BestPriceRecord bestPriceRecord);

    /**
     * 获得标的最优报价
     * @param subjectId
     * @return
     */
    List<BestPriceRecord> getBestPriceBySubject(String subjectId);
}
