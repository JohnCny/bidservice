package com.eccjt.bidservice.sysuserrole.dao;

import com.eccjt.bidservice.sysuserrole.model.SysUserRole;
import org.apache.ibatis.jdbc.SQL;

public class SysUserRoleSqlProvider {

    public String insertSelective(SysUserRole record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_user_role");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getUser() != null) {
            sql.VALUES("user", "#{user,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            sql.VALUES("role", "#{role,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}