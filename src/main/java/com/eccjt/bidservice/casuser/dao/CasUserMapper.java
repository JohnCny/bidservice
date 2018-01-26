package com.eccjt.bidservice.casuser.dao;

import com.eccjt.bidservice.casuser.model.CasUser;
import com.eccjt.bidservice.casuser.model.CasUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CasUserMapper {
    long countByExample(CasUserExample example);

    int deleteByExample(CasUserExample example);

    int insert(CasUser record);

    int insertSelective(CasUser record);

    List<CasUser> selectByExample(CasUserExample example);

    int updateByExampleSelective(@Param("record") CasUser record, @Param("example") CasUserExample example);

    int updateByExample(@Param("record") CasUser record, @Param("example") CasUserExample example);
}