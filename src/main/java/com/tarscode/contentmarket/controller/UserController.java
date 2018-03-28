package com.tarscode.contentmarket.controller;

import com.tarscode.contentmarket.entity.User;
import com.tarscode.contentmarket.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.controller 类名: UserController
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 02:20
 * 【功能】:
 * 【备注】:
 */

@Controller
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String login(String name,String password) {
        User user = userService.getByName(name);
        if(user!=null&&user.getPassword().equals(password+user.getSalt())) {
            return "redirect:/jsp/index.jsp";
        }else{
            return "redirect:/jsp/login.jsp";
        }
    }

    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    @ResponseBody
    public void login2(String name,String password) {
        User user = userService.getByName(name);

    }
}