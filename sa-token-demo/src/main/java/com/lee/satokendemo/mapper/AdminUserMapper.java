package com.lee.satokendemo.mapper;

import com.lee.satokendemo.model.entity.AdminUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * (AdminUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-30 14:52:00
 */
@Repository
public interface AdminUserMapper extends JpaRepository<AdminUserEntity, Integer> {

    AdminUserEntity findByUsernameAndPassword(String userName, String password);

    @Query("select m.menuName from admin_user u, user_role ur, role_menu rm, role r, menu m " +
            "where u.id = user_role.userId " +
            "and user_role.roleId = r.id " +
            "and r.id = role_menu.roleId " +
            "and role_menu.menuId = m.id")
    List<String> getMenuList(Integer id);

}