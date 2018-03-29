package com.tarscode.contentmarket.entity;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.entity 类名: BuyItem
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 21:07
 * 【功能】: 买家物品实体类
 * 【备注】:
 */
public class BuyItem {
    private long id;
    private String title;
    private double price;
    private String image;
    private int status; //0:未购买;1:已购买

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}