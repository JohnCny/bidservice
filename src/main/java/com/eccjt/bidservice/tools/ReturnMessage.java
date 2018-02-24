package com.eccjt.bidservice.tools;


import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ReturnMessage {

    public String returnMessageInt(Integer status){
        if (status==0){
            return "Failed";
        }

        return "Success";
    }

    public Map returnMessageMap(Integer status,Map resultMap){
        if (status==0){
            resultMap.put("result","Failed");
        }
        else{
            resultMap.put("result","Success");
        }
        return resultMap;

    }
}
