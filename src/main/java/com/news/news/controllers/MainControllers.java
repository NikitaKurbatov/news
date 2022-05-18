package com.news.news.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllers {

    @GetMapping("/")
    public String startHome(Model model) {
        model.addAttribute("home", "Главная страница");
        return "home";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("home", "Главная страница");
        return "home";
    }

    @GetMapping("/price")
    public String price (Model model){
        model.addAttribute("price", "Цена");
        return "price";
    }

    @GetMapping("/partners")
    public String partners (Model model){
        model.addAttribute("partners", "Партнеры");
        return "partners";
    }

    @GetMapping("/about")
    public String about (Model model){
        model.addAttribute("about", "О нас");
        return "about";
    }

}
