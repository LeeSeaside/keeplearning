package com.lee.elasticsearchdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * <p>
 * 通用API接口返回
 * </p>
 * @description: 通用API接口返回
 * @author: hehai
 * @date: Created in 2021年7月30日
 * @version: V1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> implements Serializable {

    private static final long serialVersionUID = -5500346684700140583L;

    /**
     * 通用返回状态
     */
    private Integer code;
    /**
     * 通用返回信息
     */
    private String message;
    /**
     * 通用返回数据
     */
    private T data;
}