package com.tarscode.contentmarket.controller;

import com.tarscode.contentmarket.entity.User;
import com.tarscode.contentmarket.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.controller 类名: UserController
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 02:20
 * 【功能】:
 * 【备注】:
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model, String name, String password, HttpSession session) {
        User user = userService.getByName(name);
        if (user != null && user.getPassword().equals(password + user.getSalt())) {
            session.setAttribute("userName", user.getName());
            session.setAttribute("userId", user.getId());
            session.setAttribute("userType", user.getType());
            if(user.getType()==1){
                return "index";
            }else{
                return "index2";
            }
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String login(HttpSession session) {
        session.setAttribute("userName", null);
        session.setAttribute("userId", null);
        session.setAttribute("userType", null);
        return "index";
    }
}

