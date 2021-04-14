package com.lee.satokendemo.controller;

import com.lee.satokendemo.utils.RedisUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * Created by hehai on 2021/4/14
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Resource
    private RedisUtil redisUtil;

    @PostMapping("/setKey")
    public String setKey(String key, String value) {
        redisUtil.set(key, value);
        return "ok";
    }

    @PostMapping("/getKey")
    public String getKey(String key) {
        return redisUtil.get(key);
    }

}
