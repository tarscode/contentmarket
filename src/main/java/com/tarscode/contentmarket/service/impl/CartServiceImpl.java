package com.tarscode.contentmarket.service.impl;

import com.tarscode.contentmarket.dao.CartDao;
import com.tarscode.contentmarket.dao.ItemDao;
import com.tarscode.contentmarket.dao.OrderDao;
import com.tarscode.contentmarket.entity.Cart;
import com.tarscode.contentmarket.entity.Item;
import com.tarscode.contentmarket.entity.Order;
import com.tarscode.contentmarket.entity.User;
import com.tarscode.contentmarket.service.CartService;
import com.tarscode.contentmarket.uitl.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    CartDao cartDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    OrderDao orderDao;

    @Override
    public List<Cart> listAll(User user) {
        List<Cart> list = cartDao.listAll();
        return list;
    }

    @Override
    public int add(Cart cart) {
        return cartDao.add(cart);
    }

    @Override
    @Transactional
    public void buy(List<Cart> list) {
        for(Cart cart:list){
            Item item = itemDao.queryById(cart.getItemId());
            Order order = new Order();
            Date date = new Date();
            String currentDate = DateUtil.date2String(date);
            order.setItemId(item.getId());
            order.setPrice(item.getPrice());
            order.setTitle(item.getTitle());
            order.setImage(item.getImage());
            order.setCreateTime(currentDate);
            order.setCount(1);
            orderDao.add(order);
            cartDao.delete(cart);
        }
    }

}
