package com.lee.fluentmybatis.demo;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONUtil;
import com.lee.fluentmybatis.demo.dao.impl.TUserDaoImpl;
import com.lee.fluentmybatis.demo.dao.intf.TUserDao;
import com.lee.fluentmybatis.demo.entity.TUserEntity;
import com.lee.fluentmybatis.demo.wrapper.TUserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FluentMybatisDemoApplicationTests {

    @Autowired
    TUserDao userDao;
    @Autowired
    TUserDaoImpl userDaoImpl;

    @Test
    void contextLoads() {
        TUserEntity userEntity = userDao.selectById(1);
        TUserQuery userQuery = new TUserQuery().where.openid().eq("oXfxAwdVN1-KRQotCZ-VQoS76FSg").end();
        List<TUserEntity> userEntityList = userDaoImpl.listEntity(userQuery);
        Console.log(JSONUtil.toJsonStr(userEntityList));
    }

}
