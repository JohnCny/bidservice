package com.eccjt.bidservice.bidhistory.service;

import com.eccjt.bidservice.bidhistory.model.BestPriceRecord;

import java.util.List;

public interface BestPriceRecordService {
    /**
     * 新增最优报价记录
     * @param bestPriceRecord
     * @param version
     * @return
     */
    Integer createBestPriceRecord(BestPriceRecord bestPriceRecord,Integer version);

    /**
     * 更新最优报价记录
     * @param bestPriceRecord
     * @param version
     * @return
     */
    Integer updateBestPriceRecord(BestPriceRecord bestPriceRecord,Integer version);

    /**
     * 获得标的最优报价
     * @param subjectId
     * @return
     */
    List<BestPriceRecord> getBestPriceBySubject(String subjectId);
}
