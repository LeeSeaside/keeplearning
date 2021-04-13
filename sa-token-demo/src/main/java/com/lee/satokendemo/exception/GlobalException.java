package com.lee.satokendemo.exception;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 * Created by hehai on 2021/4/13
 */
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler
    public JSONObject handlerNotRoleException(Exception e) {
        e.printStackTrace();
        return JSONUtil.createObj().putOpt("msg", e.getMessage());
    }

}
