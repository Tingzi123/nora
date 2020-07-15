package com.example.ausu.myapplication.model;

import android.graphics.Bitmap;

public class ChatItemListViewBean {

    private int type;          //类型，用于表示是哪个家伙
    private String text;       //文本信息
    private Bitmap icon;       //图片

    public ChatItemListViewBean() {

    }

    //三个get方法和三个set方法
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }
}
