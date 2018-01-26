package com.eccjt.bidservice.subject.service;


import com.eccjt.bidservice.subject.model.Subject;


import java.util.List;

/**
 * 标的业务逻辑接口类
 * Created by johhny on 17/10/18.
 */

public interface SubjectService {

    /**
     * 根据ID查找标的
     * @param id
     * @return
     */
    Subject findSubjectById(String id);

    /**
     * 新增标的信息
     * @param subject
     * @return
     */
    Integer saveSubject(Subject subject);

    /**
     * 更新标的信息
     * @param subject
     * @return
     */
    Integer updateSubject(Subject subject);

    /**
     * 删除标的
     * @param id
     * @return
     */
    Integer deleteSubject(String id);

//    /**
//     * 获得标的的最佳竞价
//     * @param subjectId
//     * @return
//     */
//    Bid getBestBid(String subjectId);

//    /**
//     * 获得标的的规则
//     * @param subjectId
//     * @return
//     */
//    SubjectRule getSubjectRule(String subjectId);

    /**
     * 根据状态获得用户已报名的标的
     * @param status
     * @return
     */
    List<Subject> getSubjects(Byte status);
}
