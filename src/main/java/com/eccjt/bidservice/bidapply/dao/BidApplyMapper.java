package com.eccjt.bidservice.bidapply.dao;

import com.eccjt.bidservice.bidapply.model.BidApply;

import java.util.List;

import com.eccjt.bidservice.bidapply.model.BidApplyExample;
import org.apache.ibatis.annotations.Param;

public interface BidApplyMapper {
    long countByExample(BidApplyExample example);

    int deleteByExample(BidApplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(BidApply record);

    int insertSelective(BidApply record);

    List<BidApply> selectByExample(BidApplyExample example);

    BidApply selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BidApply record, @Param("example") BidApplyExample example);

    int updateByExample(@Param("record") BidApply record, @Param("example") BidApplyExample example);

    int updateByPrimaryKeySelective(BidApply record);

    int updateByPrimaryKey(BidApply record);
}