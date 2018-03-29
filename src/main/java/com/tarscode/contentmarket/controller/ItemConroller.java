package com.tarscode.contentmarket.controller;

import com.tarscode.contentmarket.entity.Item;
import com.tarscode.contentmarket.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.controller 类名: ItemConroller
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 13:11
 * 【功能】:
 * 【备注】:
 */
@Controller
@RequestMapping("/item")
public class ItemConroller {

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestParam("title") String title, @RequestParam("price") Double price, @RequestParam("image") String image,
                      @RequestParam("summary") String summary, @RequestParam("detail") String detail, HttpSession session) {
        String userType = String.valueOf(session.getAttribute("userType"));

        if (userType == null || !userType.equals("2")) {
            return "publicError";
        } else {
            Item item = new Item();
            item.setTitle(title);
            item.setPrice(price);
            item.setImage(image);
            item.setSummary(summary);
            item.setDetail(detail);
            itemService.add(item);
            return "publicSubmit";
        }
    }
}