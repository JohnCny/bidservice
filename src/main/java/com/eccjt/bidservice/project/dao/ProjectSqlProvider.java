package com.eccjt.bidservice.project.dao;

import com.eccjt.bidservice.project.model.Project;
import org.apache.ibatis.jdbc.SQL;

public class ProjectSqlProvider {

    public String insertSelective(Project record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("project");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectName() != null) {
            sql.VALUES("project_name", "#{projectName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrg() != null) {
            sql.VALUES("org", "#{org,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}