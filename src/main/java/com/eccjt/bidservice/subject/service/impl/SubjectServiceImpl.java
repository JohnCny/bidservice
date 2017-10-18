package com.eccjt.bidservice.subject.service.impl;

import com.eccjt.bidservice.bid.model.Bid;
import com.eccjt.bidservice.subject.dao.SubjectDao;
import com.eccjt.bidservice.subject.model.Subject;
import com.eccjt.bidservice.subject.service.SubjectService;
import com.eccjt.bidservice.subjectrule.model.SubjectRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * 标的业务实现类
 * Created by johhny on 17/10/18.
 */

@Service
public class SubjectServiceImpl implements SubjectService{

    private static final Logger LOGGER= LoggerFactory.getLogger(SubjectServiceImpl.class);

    @Autowired
    private SubjectDao subjectDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Subject findSubjectById(Long id) {
        //从缓存中读取标的信息
        String key="subject_"+id;
        ValueOperations<String,Subject> operations= redisTemplate.opsForValue();

        boolean hasKey=redisTemplate.hasKey(key);
        //缓存命中
        if (hasKey){
            Subject subject=operations.get(key);
            return subject;
        }

        Subject subject=subjectDao.findById(id);
        //插入缓存
        operations.set(key,subject);
        return subject;
    }

    @Override
    public Long saveSubject(Subject subject) {
        return subjectDao.saveSubject(subject);
    }

    @Override
    public Long updateSubject(Subject subject) {
        Long ret=subjectDao.updateSubject(subject);

        //更新缓存
        String key="subject_"+subject.getId();
        ValueOperations<String,Subject> operations= redisTemplate.opsForValue();

        operations.set(key,subject);

        return ret;
    }

    @Override
    public Long deleteSubject(Long id) {
        Long ret=subjectDao.deleteSubject(id);

        //删除缓存
        String key="subject_"+id;
        boolean hasKey=redisTemplate.hasKey(key);
        if (hasKey){
            redisTemplate.delete(key);
        }

        return ret;
    }

    @Override
    public Bid getBestBid(Long subjectId) {
        return null;
    }

    @Override
    public SubjectRule getSubjectRule(Long subjectId) {
        return null;
    }
}
