package com.tarscode.contentmarket.dao;

import com.tarscode.contentmarket.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.dao 类名: UserDao
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 01:06
 * 【功能】:
 * 【备注】:
 */
public interface UserDao {

    User queryByName(@Param("name") String name);
}