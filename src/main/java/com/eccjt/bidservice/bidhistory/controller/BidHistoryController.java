package com.eccjt.bidservice.bidhistory.controller;

import com.eccjt.bidservice.bidhistory.model.BidHistory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by Johnny on 2018/2/25.
 */

@RestController
@RequestMapping(value = "/api/bidhistory")
public class BidHistoryController {

    @RequestMapping(value="/{id}",method = RequestMethod.POST)
    public HashMap addBidHistory(@RequestBody BidHistory bidHistory) {
        HashMap<String,String> result=new HashMap<>();
        //消费MQ

        //获得当前最优

        //新增记录，新增失败重试，当次数超过3次插入失败队列

        //更新缓存-1、移出正在处理队列。2、更新缓存报价历史记录

        //返回结果
       return result;
    }

}
