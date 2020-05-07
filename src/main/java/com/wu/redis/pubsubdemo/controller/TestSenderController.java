package com.wu.redis.pubsubdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TestSenderController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //向redis消息队列pmp和channel发布消息
    @Scheduled(fixedRate = 1000)
    public void sendMessage() {
        stringRedisTemplate.convertAndSend("pmp",String.valueOf(Math.random()));
        stringRedisTemplate.convertAndSend("channel",String.valueOf(Math.random()));

    }
}
