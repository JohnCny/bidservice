package com.eccjt.bidservice.subjectpriority.dao;

import com.eccjt.bidservice.subjectpriority.model.SubjectPriority;
import org.apache.ibatis.jdbc.SQL;

public class SubjectPrioritySqlProvider {

    public String insertSelective(SubjectPriority record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("subject_priority");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getUser() != null) {
            sql.VALUES("user", "#{user,jdbcType=VARCHAR}");
        }
        
        if (record.getSubject() != null) {
            sql.VALUES("subject", "#{subject,jdbcType=VARCHAR}");
        }
        
        if (record.getPriorityLevel() != null) {
            sql.VALUES("priority_level", "#{priorityLevel,jdbcType=TINYINT}");
        }
        
        return sql.toString();
    }
}