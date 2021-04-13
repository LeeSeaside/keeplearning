package com.lee.satokendemo.service.impl;

import com.lee.satokendemo.dao.RoleDao;
import com.lee.satokendemo.service.RoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * (Role)表服务实现类
 *
 * @author makejava
 * @since 2021-04-09 17:19:08
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleDao roleDao;

    @Override
    public List<String> getRoleList(Integer id) {
        return roleDao.getRoleList(id);
    }
}