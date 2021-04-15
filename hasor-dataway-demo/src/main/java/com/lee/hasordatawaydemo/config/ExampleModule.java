package com.lee.hasordatawaydemo.config;

import net.hasor.core.ApiBinder;
import net.hasor.core.DimModule;
import net.hasor.db.JdbcModule;
import net.hasor.db.Level;
import net.hasor.spring.SpringModule;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 将 Spring 使用的数据源导入到 Hasor 环境共 Dataway 使用。
 */
@DimModule
@Component
public class ExampleModule implements SpringModule {

    @Resource
    private DataSource dataSource;

    public void loadModule(ApiBinder apiBinder) throws Throwable {
        // .DataSource form Spring boot into Hasor
        apiBinder.installModule(new JdbcModule(Level.Full, this.dataSource));
        // .custom DataQL
        //apiBinder.tryCast(QueryApiBinder.class).loadUdfSource(apiBinder.findClass(DimUdfSource.class));
        //apiBinder.tryCast(QueryApiBinder.class).bindFragment("sql", SqlFragment.class);
    }
}