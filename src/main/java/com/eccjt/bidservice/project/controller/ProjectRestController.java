package com.eccjt.bidservice.project.controller;

import com.eccjt.bidservice.project.model.Project;
import com.eccjt.bidservice.project.service.ProjectService;
import com.eccjt.bidservice.tools.ReturnMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/project")
public class ProjectRestController {
    @Autowired
    ProjectService projectService;

    @Autowired
    private ReturnMessage returnMessage;

    @RequestMapping(value="/",method = RequestMethod.POST)
    public Map addProject(@RequestBody Project project) {
        //获得插入结果,todo:判断org是否已在本地库，不在本地库需要新增
        Integer result=projectService.createProject(project);

        Map<String,String> resultMap=new HashMap<>();
        resultMap.put("project_id",project.getId());

        return returnMessage.returnMessageMap(result,resultMap);
    }

}
