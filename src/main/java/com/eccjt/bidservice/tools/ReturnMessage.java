package com.eccjt.bidservice.tools;

import org.springframework.stereotype.Component;

@Component
public class ReturnMessage {

    public String returnMessageInt(Integer status){
        if (status==0){
            return "Failed";
        }

        return "Success";
    }
}
