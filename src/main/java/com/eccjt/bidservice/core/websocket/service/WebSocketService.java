package com.eccjt.bidservice.core.websocket.service;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/timer")
@Component
public class WebSocketService {
    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
    private static CopyOnWriteArraySet<WebSocketService> webSocketSet = new CopyOnWriteArraySet<WebSocketService>();

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    /**
     * 连接建立成功调用的方法*/
    @OnOpen
    public  void onOpen(Session session) {
        this.session = session;
        webSocketSet.add(this);     //加入set中
        try {
            while(true){
                SingleTimer timer = SingleTimer.getInstance();

                sendMessage(timer.countingDown().toString());

                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println("error");
        }
    }


    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        webSocketSet.remove(this);  //从set中删除
    }

    /**
     * 发送消息
     * @param message
     * @throws IOException
     */
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
//        this.session.getAsyncRemote().sendText(message);
    }

    @OnError
    public void handleError(Session session, Throwable error){
        //todo:需要检查，会报IO错误，客户端关闭了连接，但是容器中还保持着连接，应该与循环有关
    }
}
