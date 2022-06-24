package com.news.news.controllers;


import com.news.news.models.Client;
import com.news.news.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class MainController {
    @Autowired
    private ClientRepository clientRepository;

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
    @PostMapping("/request_call")
    public String newsNewsAdd (@RequestParam String name, @RequestParam String mobile_number, @RequestParam String text, Model model){
        LocalDate date = LocalDate.now();
        Client client = new Client(name, mobile_number, text, date);
        clientRepository.save(client);
        return "redirect:/news";
    }
    @GetMapping("/login")
    public String login(Model model) {
        return "home";
    }

}
