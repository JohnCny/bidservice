package com.eccjt.bidservice.project.service.impl;

import com.eccjt.bidservice.project.dao.ProjectMapper;
import com.eccjt.bidservice.project.model.Project;
import com.eccjt.bidservice.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    ProjectMapper projectMapper;

    @Override
    public Integer createProject(Project project) {
        return projectMapper.insert(project);
    }

    @Override
    public String getProject(String projectId) {
        return null;
    }

    @Override
    public List<Project> findProjectByName(String projectname) {
        return null;
    }
}
