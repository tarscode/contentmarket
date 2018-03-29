package com.tarscode.contentmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 【工程】: contentmarket 包名: com.tarscode.contentmarket.controller 类名: IndexController
 * 【作者】: liuyang
 * 【时间】: 2018/3/29 11:05
 * 【功能】:
 * 【备注】:
 */

@Controller
public class IndexController {


    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "public", method = RequestMethod.GET)
    public String publicItem() {
        return "public";
    }
}