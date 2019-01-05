package com.multibrandinfotech.retrofitpost;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Md. Rejaul Karim on 1/3/2019.
 * Copyright (c) 2019 MULTIBRAND INFOTECH LTD
 */
public class RetrofitClient {

    private static final String post_url = "http://182.163.102.201:8086/android_test/";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;

    public RetrofitClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(post_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getInstance(){
        if(mInstance == null){
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }

    public Api getApi(){
        return retrofit.create(Api.class);
    }
}
