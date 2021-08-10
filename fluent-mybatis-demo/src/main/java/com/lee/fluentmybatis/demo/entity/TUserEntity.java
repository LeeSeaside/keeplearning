package com.lee.fluentmybatis.demo.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.annotation.TableField;
import cn.org.atool.fluent.mybatis.annotation.TableId;
import cn.org.atool.fluent.mybatis.base.IEntity;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import cn.org.atool.fluent.mybatis.functions.TableSupplier;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * TUserEntity: 数据映射实体定义
 *
 * @author Powered By Fluent Mybatis
 */
@SuppressWarnings({"unchecked"})
@Data
@Accessors(
    chain = true
)
@EqualsAndHashCode(
    callSuper = false
)
@FluentMybatis(
    table = "t_user"
)
public class TUserEntity extends RichEntity {
  private static final long serialVersionUID = 1L;

  /**
   */
  @TableId("id")
  private Integer id;

  /**
   * 授权接口凭证
   */
  @TableField("access_token")
  private String accessToken;

  /**
   * 城市
   */
  @TableField("city")
  private String city;

  /**
   * 国家
   */
  @TableField("country")
  private String country;

  /**
   * 创建时间
   */
  @TableField("create_time")
  private Date createTime;

  /**
   * access_token超时时间
   */
  @TableField("expires_in")
  private Integer expiresIn;

  /**
   * 头像url
   */
  @TableField("headimgurl")
  private String headimgurl;

  /**
   * 是否用户自定义背景图 0：否 1：是
   */
  @TableField("isuserbg")
  private Integer isuserbg;

  /**
   * 最后更新时间
   */
  @TableField("last_update_time")
  private Date lastUpdateTime;

  /**
   * 本地头像路径
   */
  @TableField("local_head")
  private String localHead;

  /**
   * 用户手机
   */
  @TableField("mobile")
  private String mobile;

  /**
   * 姓名
   */
  @TableField("name")
  private String name;

  /**
   * 昵称
   */
  @TableField("nickname")
  private String nickname;

  /**
   * openid
   */
  @TableField("openid")
  private String openid;

  /**
   * 积分总量
   */
  @TableField("points")
  private Integer points;

  /**
   * 被赞次数
   */
  @TableField("praise")
  private Integer praise;

  /**
   * 用户特权信息
   */
  @TableField("privilege")
  private String privilege;

  /**
   * 省份
   */
  @TableField("province")
  private String province;

  /**
   */
  @TableField("refresh_time")
  private Date refreshTime;

  /**
   * 用户刷新access_token
   */
  @TableField("refresh_token")
  private String refreshToken;

  /**
   * 性别：0：未知 1：男 2：女
   */
  @TableField("sex")
  private Integer sex;

  /**
   */
  @TableField("share_qrcode")
  private String shareQrcode;

  /**
   */
  @TableField("share_qrcode_refresh_time")
  private Long shareQrcodeRefreshTime;

  /**
   * 状态值，0：正常 1：冻结 2：删除
   */
  @TableField("status")
  private Integer status;

  /**
   * UnionID
   */
  @TableField("unionid")
  private String unionid;

  /**
   * 用户微信号
   */
  @TableField("wechat")
  private String wechat;

  @Override
  public Serializable findPk() {
    return this.id;
  }

  @Override
  public final Class<? extends IEntity> entityClass() {
    return TUserEntity.class;
  }

  @Override
  public final TUserEntity changeTableBelongTo(TableSupplier supplier) {
    return super.changeTableBelongTo(supplier);
  }

  @Override
  public final TUserEntity changeTableBelongTo(String table) {
    return super.changeTableBelongTo(table);
  }
}
