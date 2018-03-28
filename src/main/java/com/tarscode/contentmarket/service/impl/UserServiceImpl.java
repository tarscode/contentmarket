package com.tarscode.contentmarket.service.impl;

import com.tarscode.contentmarket.dao.UserDao;
import com.tarscode.contentmarket.entity.User;
import com.tarscode.contentmarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.service.impl 类名: UserServiceImpl
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 02:25
 * 【功能】:
 * 【备注】:
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;


    @Override
    public User getByName(String name) {

        User user = userDao.queryByName(name);
        return user;
    }
}