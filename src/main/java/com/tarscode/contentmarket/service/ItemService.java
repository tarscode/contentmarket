package com.tarscode.contentmarket.service;

import com.tarscode.contentmarket.entity.BuyItem;
import com.tarscode.contentmarket.entity.Item;
import com.tarscode.contentmarket.entity.SellItem;
import com.tarscode.contentmarket.entity.User;

import java.util.List;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.service 类名: ItemService
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 15:24
 * 【功能】:
 * 【备注】:
 */
public interface ItemService {

    int add(Item item);

    //获取买家全部内容
    List<BuyItem> listAllBuyItems(User user);

    //获取买家未购买内容
    List<BuyItem> listNotBuyItems(User user);

    //获取卖家售出内容
    List<SellItem> listAllSellItems(User user);

    Item getItem(long id);
}