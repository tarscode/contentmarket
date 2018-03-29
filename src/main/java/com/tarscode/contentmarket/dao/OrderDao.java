package com.tarscode.contentmarket.dao;

import com.tarscode.contentmarket.entity.Item;
import com.tarscode.contentmarket.entity.Order;

import java.util.List;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.dao 类名: OrderDao
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 20:33
 * 【功能】:
 * 【备注】:
 */
public interface OrderDao {

    List<Order> listAll();

}