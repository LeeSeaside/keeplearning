package com.lee.satokendemo.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2021-04-09 16:40:16
 */
@Entity(name = "role")
@Getter
@Setter
@Accessors(chain = true)
public class Role {

    /**
    * 角色id
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
    * 角色名
    */
    private String roleName;

}