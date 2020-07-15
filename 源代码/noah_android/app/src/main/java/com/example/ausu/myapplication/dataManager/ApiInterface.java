package com.example.ausu.myapplication.dataManager;

import com.example.ausu.myapplication.model.User;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

import com.example.ausu.myapplication.model.UserInfo;
import com.xdw.mvp.model.Result;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    //登录
    @FormUrlEncoded
    @POST("login")
    Observable<Result<User>> login(@Field("username") String username,@Field("password") String password);
    //注册
    @FormUrlEncoded
    @POST("register")
    Observable<Result<User>> register(@Field("username") String username,@Field("password") String password);
    //查询一个用户
    @GET("getUser/{username}")
    Observable<Result<List<UserInfo>>> getUser(@Path("username") String username);
    //查询所有用户
    @GET("getAllUser")
    Observable<Result<List<UserInfo>>> getAllUser();
}
