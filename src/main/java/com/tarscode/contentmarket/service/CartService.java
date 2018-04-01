package com.tarscode.contentmarket.service;

import com.tarscode.contentmarket.entity.Cart;
import com.tarscode.contentmarket.entity.User;

import java.util.List;

public interface CartService {

    List<Cart> listAll(User user);

    int add(Cart cart);

    void buy(List<Cart> list);

}
