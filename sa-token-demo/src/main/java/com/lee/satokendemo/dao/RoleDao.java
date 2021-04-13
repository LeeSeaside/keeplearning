package com.lee.satokendemo.dao;

import com.lee.satokendemo.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * (Role)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-09 16:56:53
 */
@Repository
public interface RoleDao extends JpaRepository<Role, Integer> {

    @Query(value = "select distinct r.role_name from admin_user u, user_role ur, role r " +
            "where ?1 = ur.user_id " +
            "and ur.role_id = r.id ",
            nativeQuery = true)
    List<String> getRoleList(Integer id);
}