package com.eccjt.bidservice.sysorg.dao;

import com.eccjt.bidservice.sysorg.model.SysOrg;
import org.apache.ibatis.jdbc.SQL;

public class SysOrgSqlProvider {

    public String insertSelective(SysOrg record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_org");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgName() != null) {
            sql.VALUES("org_name", "#{orgName,jdbcType=VARCHAR}");
        }
        
        if (record.getPresentOrg() != null) {
            sql.VALUES("present_org", "#{presentOrg,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgToken() != null) {
            sql.VALUES("org_token", "#{orgToken,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}