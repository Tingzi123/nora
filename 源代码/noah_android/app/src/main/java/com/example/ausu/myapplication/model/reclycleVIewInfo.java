package com.example.ausu.myapplication.model;

public class reclycleVIewInfo {
    private String username;
    private String portraitUrl;
    private String context;
    private int icon;
    private String subject_image;
    private String video_url;


    public reclycleVIewInfo(String username, String portraitUrl, String context, int icon) {
        this.username = username;
        this.portraitUrl = portraitUrl;
        this.context = context;
        this.icon = icon;
    }

    public reclycleVIewInfo(String username, String portraitUrl, String context, int icon, String subject_image, String video_url) {
        this.username = username;
        this.portraitUrl = portraitUrl;
        this.context = context;
        this.icon = icon;
        this.subject_image = subject_image;
        this.video_url = video_url;
    }

    public String getSubject_image() {
        return subject_image;
    }

    public void setSubject_image(String subject_image) {
        this.subject_image = subject_image;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getUsername() {
        return username;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public String getContext() {
        return context;
    }

    public int getIcon() {
        return icon;
    }
}
