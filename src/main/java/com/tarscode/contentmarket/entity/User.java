package com.tarscode.contentmarket.entity;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.entity 类名: User
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 00:39
 * 【功能】:
 * 【备注】:
 */
public class User {

    private Long id;
    private String name;
    private String password;
    private String salt;
    private String phone;
    private int type; //用于区分买家和卖家类型
    private int state; //用户注销使用


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}