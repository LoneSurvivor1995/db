package com.example.dbredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {

    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/get")
    public String get(){
        return redisTemplate.getConnectionFactory().getConnection().toString();
    };

}
