package com.eccjt.bidservice.subjectoperationrecord.dao;

import com.eccjt.bidservice.subjectoperationrecord.model.SubjectOperationRecord;
import org.apache.ibatis.jdbc.SQL;

public class SubjectOperationRecordSqlProvider {

    public String insertSelective(SubjectOperationRecord record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("subject_operation_record");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getSubject() != null) {
            sql.VALUES("subject", "#{subject,jdbcType=VARCHAR}");
        }
        
        if (record.getOperation() != null) {
            sql.VALUES("operation", "#{operation,jdbcType=VARCHAR}");
        }
        
        if (record.getOperator() != null) {
            sql.VALUES("operator", "#{operator,jdbcType=VARCHAR}");
        }
        
        if (record.getOperateTime() != null) {
            sql.VALUES("operate_time", "#{operateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }
}