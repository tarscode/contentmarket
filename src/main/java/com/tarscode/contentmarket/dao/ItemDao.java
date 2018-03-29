package com.tarscode.contentmarket.dao;

import com.tarscode.contentmarket.entity.Item;

import java.util.List;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.dao 类名: ItemDao
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 12:47
 * 【功能】:
 * 【备注】:
 */
public interface ItemDao {

    int add(Item item);

    List<Item> listAll();

    Item queryById(long id);
}