package com.example.ausu.myapplication.dataManager;

import android.content.Context;

import com.example.ausu.myapplication.model.User;
import com.example.ausu.myapplication.model.UserInfo;
import com.xdw.mvp.http.DataManager;
import com.xdw.mvp.http.ResultFunc;
import java.util.List;
import rx.Observable;


public class MyDataManager extends DataManager {
    private ApiInterface apiInterface;
    private volatile static MyDataManager instance;
    private MyDataManager(Context context) {
       apiInterface = (ApiInterface) super.create(context);
    }

    public static MyDataManager getInstance(Context context) {
        if (instance == null) {
            synchronized (MyDataManager.class) {
                if (instance == null) {
                    instance = new MyDataManager(context);
                }
            }
        }
        return instance;
    }
    public Observable<User> login(String username,String password){
        return apiInterface.login(username,password).map(new ResultFunc<User>());
    }

    public Observable<User> register(String username,String password){
        return apiInterface.register(username,password).map(new ResultFunc<User>());
    }

    public Observable<List<UserInfo>> getUser(String username) {
        return apiInterface.getUser(username).map(new ResultFunc<List<UserInfo>>());
    }

    public Observable<List<UserInfo>> getAllUser(){
        return apiInterface.getAllUser().map(new ResultFunc<List<UserInfo>>());
    }
}
