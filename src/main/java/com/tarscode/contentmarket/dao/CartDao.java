package com.tarscode.contentmarket.dao;

import com.tarscode.contentmarket.entity.Cart;
import com.tarscode.contentmarket.entity.Order;

import java.util.List;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.dao 类名: CartDao
 * 【作者】: liuyang
 * 【时间】: 2018/4/1 19:03
 * 【功能】:
 * 【备注】:
 */
public interface CartDao {

    List<Cart> listAll();

    int add(Cart cart);

    int delete(Cart cart);
}