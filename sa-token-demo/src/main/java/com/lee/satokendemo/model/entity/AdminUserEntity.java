package com.lee.satokendemo.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.*;

/**
 * (AdminUser)实体类
 *
 * @author makejava
 * @since 2021-03-30 14:51:56
 */
@Entity(name = "admin_user")
@Getter
@Setter
@Accessors(chain = true)
public class AdminUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "au_id")
    private Integer id;
    /**
    * 用户名
    */
    @Column(name = "au_username")
    private String username;
    /**
    * 用户密码
    */
    @Column(name = "au_password")
    private String password;
    /**
    * 角色
    */
    @Column(name = "au_role")
    private Integer role;
    /**
    * 创建时间
    */
    @Column(name = "au_create_time")
    private String createTime;
    /**
    * 更新时间
    */
    @Column(name = "au_update_time")
    private String updateTime;

}