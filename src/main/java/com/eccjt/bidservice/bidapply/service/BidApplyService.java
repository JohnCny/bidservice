package com.eccjt.bidservice.bidapply.service;

import com.eccjt.bidservice.bidapply.model.BidApply;

import java.util.List;

public interface BidApplyService {
    /**
     * 标的报名信息逻辑接口类
     * Created by johhny on 18/1/17.
     */

    /**
     * 获得用户已报名
     * @param userId
     * @return
     */
    public List<BidApply> getAppliedSubject(String userId);
}
