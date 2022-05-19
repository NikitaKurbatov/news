package com.news.news.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginAccaunt(Model model) {
        model.addAttribute("login", "Авторизация");
        return "login";
    }
}
