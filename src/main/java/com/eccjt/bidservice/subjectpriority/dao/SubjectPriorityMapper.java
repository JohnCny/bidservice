package com.eccjt.bidservice.subjectpriority.dao;

import com.eccjt.bidservice.subjectpriority.model.SubjectPriority;
import com.eccjt.bidservice.subjectpriority.model.SubjectPriorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectPriorityMapper {
    long countByExample(SubjectPriorityExample example);

    int deleteByExample(SubjectPriorityExample example);

    int deleteByPrimaryKey(String id);

    int insert(SubjectPriority record);

    int insertSelective(SubjectPriority record);

    List<SubjectPriority> selectByExample(SubjectPriorityExample example);

    SubjectPriority selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SubjectPriority record, @Param("example") SubjectPriorityExample example);

    int updateByExample(@Param("record") SubjectPriority record, @Param("example") SubjectPriorityExample example);

    int updateByPrimaryKeySelective(SubjectPriority record);

    int updateByPrimaryKey(SubjectPriority record);
}