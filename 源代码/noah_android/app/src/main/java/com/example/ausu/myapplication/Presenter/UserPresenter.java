package com.example.ausu.myapplication.Presenter;

import android.content.Context;

import com.example.ausu.myapplication.dataManager.MyDataManager;
import com.example.ausu.myapplication.model.User;
import com.example.ausu.myapplication.model.UserInfo;
import com.xdw.mvp.presenter.BasePresenter;

import java.util.List;
import rx.Observable;

public class UserPresenter extends BasePresenter {
    private Context context;

    public UserPresenter(Context context) {
        this.context = context;
    }

    public void login(String username,String password){
        Observable<User> userObservable = MyDataManager.getInstance(context).login(username, password);
        commitSubscription(context,userObservable,true);
    }

    public void register(String username,String password){
        Observable<User> userObservable = MyDataManager.getInstance(context).register(username,password);
        commitSubscription(context,userObservable,true);
    }

    public void getUser(String username){
        Observable<List<UserInfo>> userObservable = MyDataManager.getInstance(context).getUser(username);
        commitSubscription(context,userObservable,true);
    }

    public void getAllUser(){
        rx.Observable<List<UserInfo>> userObservable = MyDataManager.getInstance(context).getAllUser();
        commitSubscription(context,userObservable,true);
    }


}
