package com.lee.satokendemo.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.*;

/**
 * (Menu)实体类
 *
 * @author makejava
 * @since 2021-04-09 16:40:08
 */
@Entity(name = "menu")
@Getter
@Setter
@Accessors(chain = true)
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 菜单名
     */
    private String menuName;

}