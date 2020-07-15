package com.example.ausu.myapplication.model;

public class goodsInfo {

    private int icon;
    private String goods_name;
    private String goods_content;
    private String goods_price;

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public void setGoods_content(String goods_content) {
        this.goods_content = goods_content;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public int getIcon() {
        return icon;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public String getGoods_content() {
        return goods_content;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public goodsInfo(int icon, String goods_name, String goods_content, String goods_price) {
        this.icon = icon;
        this.goods_name = goods_name;
        this.goods_content = goods_content;
        this.goods_price = goods_price;
    }
}
