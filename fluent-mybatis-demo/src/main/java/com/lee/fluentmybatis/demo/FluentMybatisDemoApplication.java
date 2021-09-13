package com.lee.fluentmybatis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FluentMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FluentMybatisDemoApplication.class, args);
    }

}
