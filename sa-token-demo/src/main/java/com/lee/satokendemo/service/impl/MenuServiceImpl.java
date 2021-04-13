package com.lee.satokendemo.service.impl;

import com.lee.satokendemo.dao.MenuDao;
import com.lee.satokendemo.service.MenuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * (Menu)表服务实现类
 *
 * @author makejava
 * @since 2021-04-09 17:19:08
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;

    @Override
    public List<String> getMenuList(Integer id) {
        return menuDao.getMenuList(id);
    }
}