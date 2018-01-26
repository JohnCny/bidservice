package com.eccjt.bidservice.bidongoingnotice.dao;

import com.eccjt.bidservice.bidongoingnotice.model.BidOngoingNotice;
import org.apache.ibatis.jdbc.SQL;

public class BidOngoingNoticeSqlProvider {

    public String insertSelective(BidOngoingNotice record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("bid_ongoing_notice");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getSubject() != null) {
            sql.VALUES("subject", "#{subject,jdbcType=VARCHAR}");
        }
        
        if (record.getMessage() != null) {
            sql.VALUES("message", "#{message,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateUser() != null) {
            sql.VALUES("create_user", "#{createUser,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }
}