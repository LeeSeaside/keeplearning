package com.lee.fluentmybatis.demo.api;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hehai on 2021/9/13
 */
@RetrofitClient(baseUrl = "${test.baseUrl}")
public interface HttpApi {

    @GET("v1/ad/exclusiveConsultationList.jspx")
    String exclusiveConsultationList();

    @GET("v1/ad/getExclusiveConsultationData.jspx?")
    String getExclusiveConsultationData(@Query("adId") Integer adId);
}
