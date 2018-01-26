package com.eccjt.bidservice.sysrole.dao;

import com.eccjt.bidservice.sysrole.model.SysRole;
import org.apache.ibatis.jdbc.SQL;

public class SysRoleSqlProvider {

    public String insertSelective(SysRole record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_role");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleName() != null) {
            sql.VALUES("role_name", "#{roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleLevel() != null) {
            sql.VALUES("role_level", "#{roleLevel,jdbcType=TINYINT}");
        }
        
        return sql.toString();
    }
}