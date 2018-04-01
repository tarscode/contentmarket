package com.tarscode.contentmarket.controller;

import com.tarscode.contentmarket.entity.Cart;
import com.tarscode.contentmarket.entity.Item;
import com.tarscode.contentmarket.entity.User;
import com.tarscode.contentmarket.service.CartService;
import com.tarscode.contentmarket.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.controller 类名: CartController
 * 【作者】: liuyang
 * 【时间】: 2018/4/1 19:01
 * 【功能】:
 * 【备注】:
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String listCart(Model model){
        User user = new User();
        List<Cart> cartList = cartService.listAll(user);
        model.addAttribute("list",cartList);
        return "cart";
    }

    @RequestMapping(value = "/add/{id}",method = RequestMethod.GET)
    public String addCart(Model model, @PathVariable("id")long id){
        Item item = itemService.getItem(id);
        Cart cart = new Cart();
        cart.setTitle(item.getTitle());
        cart.setPrice(item.getPrice());
        cart.setItemId(item.getId());
        cart.setCount(1);
        cartService.add(cart);
        return "index";
    }

    @RequestMapping(value = "/buy",method = RequestMethod.GET)
    public String buy(Model model){
        User user = new User();
        List<Cart> list = cartService.listAll(user);
        return "index";
    }

}