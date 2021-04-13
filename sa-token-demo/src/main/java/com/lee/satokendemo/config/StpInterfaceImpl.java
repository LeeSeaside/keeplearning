package com.lee.satokendemo.config;

import cn.dev33.satoken.stp.StpInterface;
import com.lee.satokendemo.service.MenuService;
import com.lee.satokendemo.service.RoleService;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;

/**
 * 自定义权限验证接口扩展
 * Created by hehai on 2021/4/9
 */
@Component    // 保证此类被SpringBoot扫描，完成sa-token的自定义权限验证扩展
public class StpInterfaceImpl implements StpInterface {

    @Resource
    private MenuService menuService;

    @Resource
    private RoleService roleService;

    /**
     * 返回一个账号所拥有的权限码集合
     */
    @Override
    public List<String> getPermissionList(Object loginId, String loginKey) {
        // 本list仅做模拟，实际项目中要根据具体业务逻辑来查询权限
        return menuService.getMenuList(Integer.valueOf(loginId.toString()));
    }

    /**
     * 返回一个账号所拥有的角色标识集合 (权限与角色可分开校验)
     */
    @Override
    public List<String> getRoleList(Object loginId, String loginKey) {
        // 本list仅做模拟，实际项目中要根据具体业务逻辑来查询角色
        return roleService.getRoleList(Integer.valueOf(loginId.toString()));
    }

}
