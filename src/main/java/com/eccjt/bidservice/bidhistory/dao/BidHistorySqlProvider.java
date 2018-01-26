package com.eccjt.bidservice.bidhistory.dao;

import com.eccjt.bidservice.bidhistory.model.BidHistory;
import org.apache.ibatis.jdbc.SQL;

public class BidHistorySqlProvider {

    public String insertSelective(BidHistory record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("bid_history");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getBidUser() != null) {
            sql.VALUES("bid_user", "#{bidUser,jdbcType=VARCHAR}");
        }
        
        if (record.getBidTime() != null) {
            sql.VALUES("bid_time", "#{bidTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBidPrice() != null) {
            sql.VALUES("bid_price", "#{bidPrice,jdbcType=BIGINT}");
        }
        
        if (record.getIsPriorityUsed() != null) {
            sql.VALUES("is_priority_used", "#{isPriorityUsed,jdbcType=TINYINT}");
        }
        
        if (record.getPriorityLevel() != null) {
            sql.VALUES("priority_level", "#{priorityLevel,jdbcType=TINYINT}");
        }
        
        if (record.getIsBestPrice() != null) {
            sql.VALUES("is_best_price", "#{isBestPrice,jdbcType=TINYINT}");
        }
        
        if (record.getSubject() != null) {
            sql.VALUES("subject", "#{subject,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }
}