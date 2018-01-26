package com.eccjt.bidservice.bidhistory.dao;

import com.eccjt.bidservice.bidhistory.model.BidHistory;
import com.eccjt.bidservice.bidhistory.model.BidHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BidHistoryMapper {
    long countByExample(BidHistoryExample example);

    int deleteByExample(BidHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(BidHistory record);

    int insertSelective(BidHistory record);

    List<BidHistory> selectByExample(BidHistoryExample example);

    BidHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BidHistory record, @Param("example") BidHistoryExample example);

    int updateByExample(@Param("record") BidHistory record, @Param("example") BidHistoryExample example);

    int updateByPrimaryKeySelective(BidHistory record);

    int updateByPrimaryKey(BidHistory record);
}