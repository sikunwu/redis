package com.wu.redis.pubsubdemo.impl;

import com.wu.redis.pubsubdemo.base.RedisMsg;

import java.time.LocalDateTime;


public class RedisPmpSub implements RedisMsg {

    /**
     * 接收消息的方法
     * @param message 订阅消息
     */
    @Override
    public void receiveMessage(String message){
        //注意通道调用的方法名要和RedisConfig2的listenerAdapter的MessageListenerAdapter参数2相同
        System.out.println("收到pmp通道的信息："+ LocalDateTime.now()+" "+message);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
