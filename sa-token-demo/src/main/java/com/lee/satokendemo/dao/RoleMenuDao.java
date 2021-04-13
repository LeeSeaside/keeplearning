package com.lee.satokendemo.dao;

import com.lee.satokendemo.model.entity.RoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (RoleMenu)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-09 16:56:53
 */
@Repository
public interface RoleMenuDao extends JpaRepository<RoleMenu, Integer> {

}