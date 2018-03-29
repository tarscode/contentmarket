package com.tarscode.contentmarket.service;

import com.tarscode.contentmarket.entity.BuyItem;
import com.tarscode.contentmarket.entity.Order;
import com.tarscode.contentmarket.entity.User;

import java.util.List;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.service 类名: OrderService
 * 【作者】: liuyang
 * 【时间】: 2018/3/30 00:47
 * 【功能】:
 * 【备注】:
 */
public interface OrderService {

    List<Order> listAll(User user);
}