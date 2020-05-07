package com.wu.redis.pubsubdemo.impl;

import com.wu.redis.pubsubdemo.base.RedisMsg;

import java.time.LocalDateTime;

public class RedisChannelSub  implements RedisMsg {
    @Override
    public void receiveMessage(String message) {
        //注意通道调用的方法名要和RedisConfig2的listenerAdapter的MessageListenerAdapter参数2相同
        System.out.println("这是RedisChannelSub"+ LocalDateTime.now()+"-----"+message);
    }
}
