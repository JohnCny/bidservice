package com.eccjt.bidservice.bidapply.dao;

import com.eccjt.bidservice.bidapply.model.BidApply;
import org.apache.ibatis.jdbc.SQL;

public class BidApplySqlProvider {

    public String insertSelective(BidApply record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("bid_apply");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getApplyStatus() != null) {
            sql.VALUES("apply_status", "#{applyStatus,jdbcType=TINYINT}");
        }
        
        if (record.getBidUser() != null) {
            sql.VALUES("bid_user", "#{bidUser,jdbcType=VARCHAR}");
        }
        
        if (record.getPayedSecDep() != null) {
            sql.VALUES("payed_sec_dep", "#{payedSecDep,jdbcType=BIGINT}");
        }
        
        if (record.getBidRoom() != null) {
            sql.VALUES("bid_room", "#{bidRoom,jdbcType=VARCHAR}");
        }
        
        if (record.getSubject() != null) {
            sql.VALUES("subject", "#{subject,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }
}