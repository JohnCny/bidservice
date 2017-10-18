package com.eccjt.bidservice.subject.dao;

import com.eccjt.bidservice.subject.model.Subject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by johhny on 17/10/18.
 */
public interface SubjectDao {
    /**
     * 查找机构下所有标的
     * @param orgId
     * @return
     */
    List<Subject> findByOrg(Long orgId);

    /**
     * 查找单个标的
     * @param id
     * @return
     */
    Subject findById(@Param("id") Long id);

    /**
     * 保存标的
     * @param subject
     * @return
     */
    Long saveSubject(Subject subject);

    /**
     * 更新标的
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

}
