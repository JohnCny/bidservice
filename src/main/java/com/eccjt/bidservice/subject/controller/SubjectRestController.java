package com.eccjt.bidservice.subject.controller;


import com.eccjt.bidservice.subject.model.Subject;
import com.eccjt.bidservice.subject.service.SubjectService;
import com.eccjt.bidservice.tools.ReturnMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by johhny on 17/10/18.
 */
@RestController
@RequestMapping(value = "/api/subject")
public class SubjectRestController {

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private ReturnMessage returnMessage;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Subject findSubject (@PathVariable("id")String id){
        return subjectService.findSubjectById(id);
    }

    @RequestMapping(value="/",method = RequestMethod.POST)
    public String addSubject(@RequestBody Subject subject) {
        return returnMessage.returnMessageInt(subjectService.saveSubject(subject));
    }

    @RequestMapping(value="/",method = RequestMethod.PUT)
    public String updateSubject(@RequestBody Subject subject){
        return returnMessage.returnMessageInt(subjectService.updateSubject(subject));
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteSubject(@PathVariable("id")String id){
        return returnMessage.returnMessageInt(subjectService.deleteSubject(id));
    }

    @RequestMapping(value="/applied_subject",method = RequestMethod.GET)
    public List<Subject> getAppliedSubject(){
        return subjectService.getSubjects((byte)'9');
    }
}
