package com.tarscode.contentmarket.service.impl;

import com.tarscode.contentmarket.dao.ItemDao;
import com.tarscode.contentmarket.entity.Item;
import com.tarscode.contentmarket.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.service.impl 类名: ItemServiceImpl
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 15:28
 * 【功能】:
 * 【备注】:
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemDao itemDao;

    @Override
    public int add(Item item) {
        return itemDao.add(item);
    }
}