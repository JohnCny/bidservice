package com.eccjt.bidservice.casuser.dao;

import com.eccjt.bidservice.casuser.model.CasUser;
import org.apache.ibatis.jdbc.SQL;

public class CasUserSqlProvider {

    public String insertSelective(CasUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("cas_user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getCasUserName() != null) {
            sql.VALUES("cas_user_name", "#{casUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getSysUser() != null) {
            sql.VALUES("sys_user", "#{sysUser,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}