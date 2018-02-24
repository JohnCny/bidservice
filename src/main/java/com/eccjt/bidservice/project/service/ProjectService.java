package com.eccjt.bidservice.project.service;

import com.eccjt.bidservice.project.model.Project;

import java.util.List;

public interface ProjectService {
    /**
     * 新增项目
     * @param project
     * @return
     */
    public Integer createProject(Project project);

    /**
     * 根据Id获取项目
     * @param projectId
     * @return
     */
    public String getProject(String projectId);

    /**
     * 根据项目名称查找项目，支持模糊查询
     * @param projectname
     * @return
     */
    public List<Project> findProjectByName(String projectname);
}
