package com.lee.satokendemo.service.impl;

import com.lee.satokendemo.mapper.AdminUserMapper;
import com.lee.satokendemo.model.entity.AdminUserEntity;
import com.lee.satokendemo.service.AdminUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * (AdminUser)表服务实现类
 *
 * @author makejava
 * @since 2021-03-30 14:52:01
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Resource
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUserEntity login(String userName, String password, Integer code) {
        return adminUserMapper.findByUsernameAndPassword(userName, password);
    }
}