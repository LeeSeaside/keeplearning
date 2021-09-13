package com.lee.fluentmybatis.demo.Controller;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.lee.fluentmybatis.demo.api.HttpApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hehai on 2021/9/13
 */
@RestController
public class TestController {

    @Autowired
    private HttpApi httpApi;

    @GetMapping("test")
    void test() {
        String s = httpApi.getExclusiveConsultationData(285);
        JSONObject jsonObject = JSONUtil.parseObj(s);
        Console.log(s);
    }
}
