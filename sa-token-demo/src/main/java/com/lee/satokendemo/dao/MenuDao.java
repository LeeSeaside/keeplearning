package com.lee.satokendemo.dao;

import com.lee.satokendemo.model.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * (Menu)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-09 16:56:53
 */
@Repository
public interface MenuDao extends JpaRepository<Menu, Integer> {

    @Query(value = "select distinct m.menu_name from admin_user u, user_role ur, role_menu rm, role r, menu m " +
            "            where 1 = ur.user_id " +
            "            and ur.role_id = r.id " +
            "            and r.id = rm.role_id " +
            "            and rm.menu_id = m.id",
            nativeQuery = true)
    List<String> getMenuList(Integer id);
}