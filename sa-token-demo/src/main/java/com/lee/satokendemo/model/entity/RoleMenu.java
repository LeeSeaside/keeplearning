package com.lee.satokendemo.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * (RoleMenu)实体类
 *
 * @author makejava
 * @since 2021-04-09 16:40:16
 */
@Entity(name = "role_menu")
@Getter
@Setter
@Accessors(chain = true)
public class RoleMenu {

    /**
    * 角色id
    */
    @Id
    private Integer roleId;
    /**
    * 菜单id
    */
    private Integer menuId;

}