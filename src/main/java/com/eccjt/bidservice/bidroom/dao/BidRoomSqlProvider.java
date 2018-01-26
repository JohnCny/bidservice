package com.eccjt.bidservice.bidroom.dao;

import com.eccjt.bidservice.bidroom.model.BidRoom;
import org.apache.ibatis.jdbc.SQL;

public class BidRoomSqlProvider {

    public String insertSelective(BidRoom record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("bid_room");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getOrg() != null) {
            sql.VALUES("org", "#{org,jdbcType=VARCHAR}");
        }
        
        if (record.getRoomName() != null) {
            sql.VALUES("room_name", "#{roomName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoomStatus() != null) {
            sql.VALUES("room_status", "#{roomStatus,jdbcType=TINYINT}");
        }
        
        if (record.getCreateDate() != null) {
            sql.VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }
}