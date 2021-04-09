package com.lee.satokendemo.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * (UserRole)实体类
 *
 * @author makejava
 * @since 2021-04-09 16:40:16
 */
@Entity(name = "user_role")
@Getter
@Setter
@Accessors(chain = true)
public class UserRole {

    /**
    * 用户id
    */
    @Id
    private Integer userId;
    /**
    * 角色id
    */
    private Integer roleId;

}