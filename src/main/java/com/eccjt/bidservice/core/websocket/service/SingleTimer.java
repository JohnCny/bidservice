package com.eccjt.bidservice.core.websocket.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SingleTimer {
    private static SingleTimer timer=new SingleTimer();

    public static SingleTimer getInstance(){
        return timer;
    }

    protected Long countingDown(){
        //时间刷新
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long diff=0L;
        try {
            Long deadLine = df.parse("2017-12-15 17:00:00").getTime();
            Long currentTime = Calendar.getInstance().getTimeInMillis();
            diff = deadLine - currentTime;
        } catch (Exception e) {
            System.out.println(e);
        }

        return diff;
    }
}
