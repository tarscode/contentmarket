package com.tarscode.contentmarket.service;

import com.tarscode.contentmarket.entity.User;
import org.springframework.stereotype.Service;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.service 类名: UserService
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 00:47
 * 【功能】:
 * 【备注】:
 */
public interface UserService {

    User getByName(String name);
}