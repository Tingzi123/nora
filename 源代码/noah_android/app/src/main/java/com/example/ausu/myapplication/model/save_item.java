package com.example.ausu.myapplication.model;

public class save_item {
    private int userIcon;
    private String username;
    private String Content;
    private int contentImage;

    public void setUserIcon(int userIcon) {
        this.userIcon = userIcon;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setContentImage(int contentImage) {
        this.contentImage = contentImage;
    }

    public int getUserIcon() {
        return userIcon;
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return Content;
    }

    public int getContentImage() {
        return contentImage;
    }

    public save_item(int userIcon, String username, String content, int contentImage) {
        this.userIcon = userIcon;
        this.username = username;
        Content = content;
        this.contentImage = contentImage;
    }
}
