package com.tarscode.contentmarket.service.impl;

import com.tarscode.contentmarket.dao.OrderDao;
import com.tarscode.contentmarket.entity.Order;
import com.tarscode.contentmarket.entity.User;
import com.tarscode.contentmarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.service.impl 类名: OrderServiceImpl
 * 【作者】: liuyang
 * 【时间】: 2018/3/30 00:49
 * 【功能】:
 * 【备注】:
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderDao orderDao;

    @Override
    public List<Order> listAll(User user) {
        return orderDao.listAll();
    }
}