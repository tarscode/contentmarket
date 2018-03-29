package com.tarscode.contentmarket.entity;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.entity 类名: Item
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 12:54
 * 【功能】: 商品实体类
 * 【备注】:
 */
public class Item {
    private long id;
    private String title;
    private double price;
    private String image;
    private String summary;
    private String detail;

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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}