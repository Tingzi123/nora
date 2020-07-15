package com.example.ausu.myapplication.model;

public class UserInfo {
    private String userId;
    private String username;
    private String password;
    private String nickName;
    private String portraitUrl;
    private String idiograph;
    private String address;

    public UserInfo(){}
    public UserInfo(String userId, String username, String password, String nickName, String portraitUrl, String idiograph, String address) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.portraitUrl = portraitUrl;
        this.idiograph = idiograph;
        this.address = address;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public void setIdiograph(String idiograph) {
        this.idiograph = idiograph;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public String getIdiograph() {
        return idiograph;
    }

    public String getAddress() {
        return address;
    }
}
