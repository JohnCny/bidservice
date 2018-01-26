package com.eccjt.bidservice.subjectoperationrecord.dao;

import com.eccjt.bidservice.subjectoperationrecord.model.SubjectOperationRecord;
import com.eccjt.bidservice.subjectoperationrecord.model.SubjectOperationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectOperationRecordMapper {
    long countByExample(SubjectOperationRecordExample example);

    int deleteByExample(SubjectOperationRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(SubjectOperationRecord record);

    int insertSelective(SubjectOperationRecord record);

    List<SubjectOperationRecord> selectByExample(SubjectOperationRecordExample example);

    SubjectOperationRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SubjectOperationRecord record, @Param("example") SubjectOperationRecordExample example);

    int updateByExample(@Param("record") SubjectOperationRecord record, @Param("example") SubjectOperationRecordExample example);

    int updateByPrimaryKeySelective(SubjectOperationRecord record);

    int updateByPrimaryKey(SubjectOperationRecord record);
}