package com.tarscode.contentmarket.service.impl;

import com.tarscode.contentmarket.dao.ItemDao;
import com.tarscode.contentmarket.dao.OrderDao;
import com.tarscode.contentmarket.entity.*;
import com.tarscode.contentmarket.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.service.impl 类名: ItemServiceImpl
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 15:28
 * 【功能】:
 * 【备注】:
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemDao itemDao;

    @Autowired
    OrderDao orderDao;

    @Override
    public int add(Item item) {
        return itemDao.add(item);
    }

    @Override
    public List<BuyItem> listAllBuyItems(User user) {
        List<Item> items = itemDao.listAll();
        List<Order> orders = orderDao.listAll();
        List<BuyItem> buyItems = new ArrayList<BuyItem>();
        for (Item item : items) {
            BuyItem buyItem = new BuyItem();
            buyItem.setId(item.getId());
            buyItem.setImage(item.getImage());
            buyItem.setPrice(item.getPrice());
            buyItem.setTitle(item.getTitle());
            buyItem.setStatus(0);
            for (Order order : orders) {
                if (item.getId() == order.getItemId()) {
                    buyItem.setStatus(1);
                    break;
                }
            }
            buyItems.add(buyItem);
        }
        return buyItems;
    }

    @Override
    public List<BuyItem> listNotBuyItems(User user) {
        List<Item> items = itemDao.listAll();
        List<Order> orders = orderDao.listAll();
        List<BuyItem> buyItems = new ArrayList<BuyItem>();

        for (Item item : items) {
            if(orders==null||orders.size()==0){
                BuyItem buyItem = new BuyItem();
                buyItem.setId(item.getId());
                buyItem.setImage(item.getImage());
                buyItem.setPrice(item.getPrice());
                buyItem.setTitle(item.getTitle());
                buyItem.setStatus(0);
                buyItems.add(buyItem);
                continue;
            }
            for(int i=0;i<orders.size();i++){
                if(item.getId()==orders.get(i).getItemId()){
                    break;
                }
                if(i==orders.size()-1){
                    BuyItem buyItem = new BuyItem();
                    buyItem.setId(item.getId());
                    buyItem.setImage(item.getImage());
                    buyItem.setPrice(item.getPrice());
                    buyItem.setTitle(item.getTitle());
                    buyItem.setStatus(0);
                    buyItems.add(buyItem);
                }
            }
        }
        return buyItems;
    }

    @Override
    public List<SellItem> listAllSellItems(User user) {
        List<Order> orders = orderDao.listAll();
        List<SellItem> sellItems = new ArrayList<SellItem>();
        for(Order order:orders){
            SellItem sellItem = new SellItem();
            sellItem.setId(order.getItemId());
            sellItem.setTitle(order.getTitle());
            sellItem.setImage(order.getImage());
            sellItem.setPrice(order.getPrice());
            sellItem.setCount(order.getCount());
            sellItems.add(sellItem);
        }
        return  sellItems;
    }

    @Override
    public Item getItem(long id) {
        return itemDao.queryById(id);
    }

    @Override
    public void buyItem(long id) {
        Item item = itemDao.queryById(id);
        Order order = new Order();
        Date date = new Date();
        order.setTitle(item.getTitle());
        order.setImage(item.getImage());
        order.setCreateTime(String.valueOf(date.getTime()));
        order.setCount(1);
        orderDao.add(order);
    }
}