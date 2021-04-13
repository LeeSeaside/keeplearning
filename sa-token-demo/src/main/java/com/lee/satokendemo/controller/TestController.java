package com.lee.satokendemo.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.lang.Console;
import com.lee.satokendemo.mapper.AdminUserMapper;
import com.lee.satokendemo.model.entity.AdminUserEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Optional;

/**
 * Created by hehai on 2021/4/7
 */
@RestController
public class TestController {

    @Resource
    private AdminUserMapper adminUserMapper;

    @PostMapping("/login")
    public String login(Integer id) {
        AdminUserEntity user = adminUserMapper.findById(id).orElse(null);
        if (!Optional.ofNullable(user).isPresent()) {
            return "fail";
        }
        // 登录成功,标记当前用户
        StpUtil.setLoginId(user.getId());
        return "ok";
    }

    @PostMapping("/home")
    public String home() {
        StpUtil.getTokenInfo();
        StpUtil.getSession();
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

    @PostMapping("/show")
    public String show() {
        // 显示当前用户的权限和角色
//        StpUtil.checkRole("管理员");
        StpUtil.checkPermission("咨询");
        Console.log(StpUtil.hasRole("管理员"));
        Console.log(StpUtil.hasPermission("咨询"));
        return "ok";
    }

    @PostMapping("/logout")
    public String logout() {
        // 踢人下线
        StpUtil.logoutByLoginId(1);
        return "ok";
    }
}
