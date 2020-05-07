package com.wu.redis.pubsubdemo.base;

import org.springframework.stereotype.Component;

@Component
public interface RedisMsg {
    public void receiveMessage(String message);
}
