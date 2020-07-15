package com.noah.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

//配置映射关系
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @NotEmpty(message = "用户名不能为空")
    @Column(nullable = false,length = 13)
    private String username;

    @NotEmpty(message = "密码不能为空")
    @Column(nullable = false,length = 30)
    private String password;

    @Column
    private String nickName;

    @Column
    private String portraitUrl;

    @Column
    private String idiograph;

    @Column
    private String address;

    public User(){

    }

    public User(int userId, String username, String password, String portraitUrl, String idiograph, String address) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.portraitUrl = portraitUrl;
        this.idiograph = idiograph;
        this.address = address;
    }

    public User(String username, String password, String nickName, String portraitUrl, String idiograph, String address) {
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.portraitUrl = portraitUrl;
        this.idiograph = idiograph;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public String getIdiograph() {
        return idiograph;
    }

    public void setIdiograph(String idiograph) {
        this.idiograph = idiograph;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", portraitUrl='" + portraitUrl + '\'' +
                ", idiograph='" + idiograph + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
