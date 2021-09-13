package com.lee.fluentmybatis.demo;

import cn.hutool.core.lang.Console;
import com.lee.fluentmybatis.demo.api.HttpApi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FluentMybatisDemoApplicationTests {

    @Autowired
    private HttpApi httpApi;

    @Test
    void test() {
        String s = httpApi.exclusiveConsultationList();
        Console.log(s);
    }

}
