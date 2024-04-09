package com.example.springdemo.controller;

import com.example.springdemo.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
@Slf4j
public class RedisController {
    private final RedisTemplate redisTemplate;

    public RedisController(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("save")
    public Result save(String key, String value){
        log.info(key +":"+value);
        redisTemplate.opsForValue().set(key, value);
        return Result.success();
    }

}
