package com.lee.satokendemo.service.impl;

import com.lee.satokendemo.model.entity.Menu;
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
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;
}