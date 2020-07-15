package com.example.ausu.myapplication.model;

public class User {
    private String username;
    private String password;
    private String nickname;
    private String portraitUrl;
    private String idiogragh;
    private String address;

   public User(){}
    public User(String username, String password, String nickname, String portraitUrl, String idiogragh, String address) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.portraitUrl = portraitUrl;
        this.idiogragh = idiogragh;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public String getIdiogragh() {
        return idiogragh;
    }

    public String getAddress() {
        return address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public void setIdiogragh(String idiogragh) {
        this.idiogragh = idiogragh;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
