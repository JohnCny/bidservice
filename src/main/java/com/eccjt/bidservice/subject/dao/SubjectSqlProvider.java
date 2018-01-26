package com.eccjt.bidservice.subject.dao;

import com.eccjt.bidservice.subject.model.Subject;
import org.apache.ibatis.jdbc.SQL;

public class SubjectSqlProvider {

    public String insertSelective(Subject record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("subject");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getBidInterval() != null) {
            sql.VALUES("bid_interval", "#{bidInterval,jdbcType=INTEGER}");
        }
        
        if (record.getBidLadder() != null) {
            sql.VALUES("bid_ladder", "#{bidLadder,jdbcType=INTEGER}");
        }
        
        if (record.getBidType() != null) {
            sql.VALUES("bid_type", "#{bidType,jdbcType=CHAR}");
        }
        
        if (record.getBidRoom() != null) {
            sql.VALUES("bid_room", "#{bidRoom,jdbcType=VARCHAR}");
        }
        
        if (record.getDeadline() != null) {
            sql.VALUES("deadline", "#{deadline,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDealType() != null) {
            sql.VALUES("deal_type", "#{dealType,jdbcType=CHAR}");
        }
        
        if (record.getIsBidStart() != null) {
            sql.VALUES("is_bid_start", "#{isBidStart,jdbcType=TINYINT}");
        }
        
        if (record.getIsBidBest() != null) {
            sql.VALUES("is_bid_best", "#{isBidBest,jdbcType=TINYINT}");
        }
        
        if (record.getIsRePrShown() != null) {
            sql.VALUES("is_re_pr_shown", "#{isRePrShown,jdbcType=TINYINT}");
        }
        
        if (record.getIsRounds() != null) {
            sql.VALUES("is_rounds", "#{isRounds,jdbcType=TINYINT}");
        }
        
        if (record.getIsPriority() != null) {
            sql.VALUES("is_priority", "#{isPriority,jdbcType=TINYINT}");
        }
        
        if (record.getManager() != null) {
            sql.VALUES("manager", "#{manager,jdbcType=VARCHAR}");
        }
        
        if (record.getProject() != null) {
            sql.VALUES("project", "#{project,jdbcType=VARCHAR}");
        }
        
        if (record.getPauseTime() != null) {
            sql.VALUES("pause_time", "#{pauseTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReserverPrice() != null) {
            sql.VALUES("reserver_price", "#{reserverPrice,jdbcType=BIGINT}");
        }
        
        if (record.getSecurityDeposit() != null) {
            sql.VALUES("security_deposit", "#{securityDeposit,jdbcType=BIGINT}");
        }
        
        if (record.getStartPrice() != null) {
            sql.VALUES("start_price", "#{startPrice,jdbcType=BIGINT}");
        }
        
        if (record.getStartTime() != null) {
            sql.VALUES("start_time", "#{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSubjectName() != null) {
            sql.VALUES("subject_name", "#{subjectName,jdbcType=VARCHAR}");
        }
        
        if (record.getSubjectStatus() != null) {
            sql.VALUES("subject_status", "#{subjectStatus,jdbcType=TINYINT}");
        }
        
        if (record.getSubjectRemark() != null) {
            sql.VALUES("subject_remark", "#{subjectRemark,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}