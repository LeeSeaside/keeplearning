package com.lee.satokendemo.service.impl;

import com.lee.satokendemo.model.entity.RoleMenu;
import com.lee.satokendemo.dao.RoleMenuDao;
import com.lee.satokendemo.service.RoleMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RoleMenu)表服务实现类
 *
 * @author makejava
 * @since 2021-04-09 17:19:08
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl implements RoleMenuService {
    @Resource
    private RoleMenuDao roleMenuDao;
}