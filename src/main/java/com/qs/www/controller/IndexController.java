package com.qs.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zun.wei on 2018/5/11.
 * To change this template use File|Default Setting
 * |Editor|File and Code Templates|Includes|File Header
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "/index/login";
    }

    @PostMapping("/login.html")
    public String login(Model model,String username, String password) {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "/index/index";
    }
}
