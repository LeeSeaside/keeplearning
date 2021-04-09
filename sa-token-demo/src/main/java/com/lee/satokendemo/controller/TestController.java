package com.lee.satokendemo.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.lee.satokendemo.mapper.AdminUserMapper;
import com.lee.satokendemo.model.entity.AdminUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

/**
 * Created by hehai on 2021/4/7
 */
@RestController
public class TestController {

    @Autowired
    private AdminUserMapper adminUserMapper;

    @PostMapping("/login")
    public String login() {
        AdminUserEntity user = adminUserMapper.findById(1).orElse(null);
        if (!Optional.ofNullable(user).isPresent()) {
            return "fail";
        }
        // 登录成功,标记当前用户
        StpUtil.setLoginId(user.getId());
        return "ok";
    }

    @PostMapping("/home")
    public String home() {
        if (!StpUtil.isLogin()) {
            return "请登录";
        }
        StpUtil.getTokenInfo();
        return "首页";
    }

    @PostMapping("/createUser")
    public String createUser() {
        AdminUserEntity userEntity = new AdminUserEntity()
                .setUsername("xiaohai")
                .setPassword("123");
        adminUserMapper.save(userEntity);
        return "ok";
    }

    @PostMapping("/find")
    public String find() {
        AdminUserEntity userEntity = adminUserMapper.findById(1).orElse(null);
        return "ok";
    }
}
