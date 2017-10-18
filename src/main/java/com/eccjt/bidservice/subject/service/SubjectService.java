package com.eccjt.bidservice.subject.service;

import com.eccjt.bidservice.bid.model.Bid;
import com.eccjt.bidservice.subject.model.Subject;
import com.eccjt.bidservice.subjectrule.model.SubjectRule;

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
    Subject findSubjectById(Long id);

    /**
     * 新增标的信息
     * @param subject
     * @return
     */
    Long saveSubject(Subject subject);

    /**
     * 更新标的信息
     * @param subject
     * @return
     */
    Long updateSubject(Subject subject);

    /**
     * 删除标的
     * @param id
     * @return
     */
    Long deleteSubject(Long id);

    /**
     * 获得标的的最佳竞价
     * @param subjectId
     * @return
     */
    Bid getBestBid(Long subjectId);

    /**
     * 获得标的的规则
     * @param subjectId
     * @return
     */
    SubjectRule getSubjectRule(Long subjectId);
}
