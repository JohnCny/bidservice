package com.eccjt.bidservice.subject.service.impl;


import com.eccjt.bidservice.bidapply.model.BidApply;
import com.eccjt.bidservice.bidapply.service.BidApplyService;
import com.eccjt.bidservice.subject.dao.SubjectMapper;
import com.eccjt.bidservice.subject.model.Subject;
import com.eccjt.bidservice.subject.model.SubjectExample;
import com.eccjt.bidservice.subject.service.SubjectService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 标的业务实现类
 * Created by johhny on 17/10/18.
 */

@Service
public class SubjectServiceImpl implements SubjectService{

    @Autowired
    private SubjectMapper subjectMapper;

    @Autowired
    private BidApplyService bidApplyService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Subject findSubjectById(String id) {
        //从缓存中读取标的信息
        String key="subject_"+id;
        ValueOperations<String,Subject> operations= redisTemplate.opsForValue();

        boolean hasKey=redisTemplate.hasKey(key);
        //缓存命中
        if (hasKey){
            Subject subject=operations.get(key);
            return subject;
        }

        Subject subject=subjectMapper.selectByPrimaryKey(id);
        //插入缓存
        operations.set(key,subject);

        return subject;
    }

    @Override
    public Integer saveSubject(Subject subject) {
        return subjectMapper.insert(subject);
    }

    @Override
    public Integer updateSubject(Subject subject) {
        Integer ret=subjectMapper.updateByPrimaryKey(subject);

        //更新缓存
        String key="subject_"+subject.getId();
        ValueOperations<String,Subject> operations= redisTemplate.opsForValue();

        operations.set(key,subject);

        return ret;
    }

    @Override
    public Integer deleteSubject(String id) {
        Integer ret=subjectMapper.deleteByPrimaryKey(id);

        //删除缓存
        String key="subject_"+id;
        boolean hasKey=redisTemplate.hasKey(key);
        if (hasKey){
            redisTemplate.delete(key);
        }

        return ret;
    }


    @Override
    public List<Subject> getSubjects(Byte status) {
        //todo:获得用户ID
        String userId="test";

        //获得客户所有已报名的标的
        List<BidApply> appliedSubject=bidApplyService.getAppliedSubject(userId);
        List<String> ids=null;

        //提取id组成查询条件列表
        for(BidApply bidApply :appliedSubject){
            ids.add(bidApply.getId());
        }

        SubjectExample subjectExample=new SubjectExample();
        subjectExample.createCriteria().andIdIn(ids).andSubjectStatusEqualTo(status);

        return subjectMapper.selectByExample(subjectExample);
    }
}
