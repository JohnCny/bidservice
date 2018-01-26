package com.eccjt.bidservice.bidapply.service.impl;

import com.eccjt.bidservice.bidapply.dao.BidApplyMapper;
import com.eccjt.bidservice.bidapply.model.BidApply;
import com.eccjt.bidservice.bidapply.model.BidApplyExample;
import com.eccjt.bidservice.bidapply.service.BidApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidApplyServiceImpl implements BidApplyService{

    @Autowired
    BidApplyMapper bidApplyMapper;

    @Override
    public List<BidApply> getAppliedSubject(String userId) {
        BidApplyExample bidApplyExample=new BidApplyExample();
        bidApplyExample.createCriteria().andBidUserEqualTo(userId);
        List<BidApply> appliedSubjets=bidApplyMapper.selectByExample(bidApplyExample);

        return appliedSubjets;
    }
}
