package com.tarscode.contentmarket.entity;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.entity 类名: Order
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 12:57
 * 【功能】: 订单实体类
 * 【备注】: 已购买内容
 */
public class Order {
    private long id;
    private long userId;
    private long itemId;
    private String title;
    private String image;
    private String createTime;
    private double price;
    private long count;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}