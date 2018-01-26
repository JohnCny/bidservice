package com.eccjt.bidservice.bidongoingnotice.dao;

import com.eccjt.bidservice.bidongoingnotice.model.BidOngoingNotice;
import com.eccjt.bidservice.bidongoingnotice.model.BidOngoingNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BidOngoingNoticeMapper {
    long countByExample(BidOngoingNoticeExample example);

    int deleteByExample(BidOngoingNoticeExample example);

    int deleteByPrimaryKey(String id);

    int insert(BidOngoingNotice record);

    int insertSelective(BidOngoingNotice record);

    List<BidOngoingNotice> selectByExample(BidOngoingNoticeExample example);

    BidOngoingNotice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BidOngoingNotice record, @Param("example") BidOngoingNoticeExample example);

    int updateByExample(@Param("record") BidOngoingNotice record, @Param("example") BidOngoingNoticeExample example);

    int updateByPrimaryKeySelective(BidOngoingNotice record);

    int updateByPrimaryKey(BidOngoingNotice record);
}