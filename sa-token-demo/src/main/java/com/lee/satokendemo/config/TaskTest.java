package com.lee.satokendemo.config;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 具体定时器Test
 * Created by hehai on 2021/6/7
 */
@Component
public class TaskTest {

    @Scheduled(cron = "*/10 * * ? * ?")
    void tt() {
        Console.log("tt:执行".concat(DateUtil.now()));
    }

}
