package com.multibrandinfotech.retrofitpost;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Md. Rejaul Karim on 1/3/2019.
 * Copyright (c) 2019 MULTIBRAND INFOTECH LTD
 */
public interface Api {
    @FormUrlEncoded
    @POST("post.php")
    Call<ResponseBody> createUser(
            @Field("UserName") String userName,
            @Field("Password") String passWord
    );
}
