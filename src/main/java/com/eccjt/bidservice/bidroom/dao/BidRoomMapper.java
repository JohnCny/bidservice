package com.eccjt.bidservice.bidroom.dao;

import com.eccjt.bidservice.bidroom.model.BidRoom;
import com.eccjt.bidservice.bidroom.model.BidRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BidRoomMapper {
    long countByExample(BidRoomExample example);

    int deleteByExample(BidRoomExample example);

    int deleteByPrimaryKey(String id);

    int insert(BidRoom record);

    int insertSelective(BidRoom record);

    List<BidRoom> selectByExample(BidRoomExample example);

    BidRoom selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BidRoom record, @Param("example") BidRoomExample example);

    int updateByExample(@Param("record") BidRoom record, @Param("example") BidRoomExample example);

    int updateByPrimaryKeySelective(BidRoom record);

    int updateByPrimaryKey(BidRoom record);
}