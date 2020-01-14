package com.example.darazreplica.api;

import com.example.darazreplica.model.User;
import com.example.darazreplica.serverresponse.SignUpResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserApi {
    @POST("signup")
    Call<SignUpResponse> registerUser(@Body User users);

    @FormUrlEncoded
    @POST("login")
    Call<SignUpResponse> checkUser(@Field("email")String email,@Field("password") String password);
}
