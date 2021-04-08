package com.lee.satokendemo.mapper;

import com.lee.satokendemo.model.entity.AdminUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (AdminUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-30 14:52:00
 */
@Repository
public interface AdminUserMapper extends JpaRepository<AdminUserEntity, Integer> {

    AdminUserEntity findByUsernameAndPassword(String userName, String password);

}