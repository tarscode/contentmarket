package com.tarscode.contentmarket.controller;

import com.tarscode.contentmarket.entity.*;
import com.tarscode.contentmarket.service.ItemService;
import com.tarscode.contentmarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.controller 类名: OrderConroller
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 13:11
 * 【功能】:
 * 【备注】:
 */
@Controller
@RequestMapping("/order")
public class OrderConroller {

    @Autowired
    OrderService orderService;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String listAllOrder(Model model){
        User user = new User();
        List<Order> list=orderService.listAll(user);
        double sum = 0.0;
        for(Order order : list){
            sum += order.getPrice();
        }
        model.addAttribute("list",list);
        model.addAttribute("sum",sum);
        return "order";
    }


}