package com.eccjt.bidservice.subject.controller;

import com.eccjt.bidservice.subject.model.Subject;
import com.eccjt.bidservice.subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by johhny on 17/10/18.
 */
@RestController
public class SubjectRestController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "/api/subject/{id}",method = RequestMethod.GET)
    public Subject findSubject(@PathVariable("id")Long id){
        return subjectService.findSubjectById(id);
    }
}
