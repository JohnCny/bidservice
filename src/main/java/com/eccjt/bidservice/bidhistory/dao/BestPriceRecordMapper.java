package com.eccjt.bidservice.bidhistory.dao;

import com.eccjt.bidservice.bidhistory.model.BestPriceRecord;
import com.eccjt.bidservice.bidhistory.model.BestPriceRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BestPriceRecordMapper {
    long countByExample(BestPriceRecordExample example);

    int deleteByExample(BestPriceRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(BestPriceRecord record);

    int insertSelective(BestPriceRecord record);

    List<BestPriceRecord> selectByExample(BestPriceRecordExample example);

    BestPriceRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BestPriceRecord record, @Param("example") BestPriceRecordExample example);

    int updateByExample(@Param("record") BestPriceRecord record, @Param("example") BestPriceRecordExample example);

    int updateByPrimaryKeySelective(BestPriceRecord record);

    int updateByPrimaryKey(BestPriceRecord record);
}