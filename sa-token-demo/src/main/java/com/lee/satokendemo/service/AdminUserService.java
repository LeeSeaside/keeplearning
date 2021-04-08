package com.lee.satokendemo.service;

import com.lee.satokendemo.model.entity.AdminUserEntity;

/**
 * (AdminUser)表服务接口
 *
 * @author makejava
 * @since 2021-03-30 14:52:00
 */
public interface AdminUserService {

    /* 登录. */
    AdminUserEntity login(String userName, String password, Integer code);

}