package com.spg.dockerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String count(){
        Long i = redisTemplate.opsForValue().increment("countPeople");
        //**我是第二个版本加的注释
        //我是第三个版本加的注释
        return "有【" + i + "】人访问了";
    }
}
