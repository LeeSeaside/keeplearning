package com.lee.satokendemo.service.impl;

import com.lee.satokendemo.dao.UserRoleDao;
import com.lee.satokendemo.service.UserRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * (UserRole)表服务实现类
 *
 * @author makejava
 * @since 2021-04-09 17:19:08
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Resource
    private UserRoleDao userRoleDao;
}