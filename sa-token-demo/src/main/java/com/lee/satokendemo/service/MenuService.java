package com.lee.satokendemo.service;

import java.util.List;

/**
 * (Menu)表服务接口
 *
 * @author makejava
 * @since 2021-04-09 16:56:53
 */
public interface MenuService {

    List<String> getMenuList(Integer id);
}