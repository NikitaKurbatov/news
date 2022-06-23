package com.news.news.controllers;


import com.news.news.models.Client;
import com.news.news.models.News;
import com.news.news.repo.ClientRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class MainController {
    @Autowired
    private ClientRepository clientRepository;
    private Document doc;
    private Thread secThread;
    private Runnable runnable;

    private void init(){
        runnable = new Runnable() {
            @Override
            public void run() {
                getWeb();
            }
        };
        secThread = new Thread(runnable);
        secThread.start();
    }
    private void getWeb(){
        try {
            doc = Jsoup.connect("https://yandex.ru/").get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @GetMapping("/")
    public String startHome(Model model) {
        model.addAttribute("home", "Главная страница");
        init();
        //model.addAttribute("euro", doc.title());
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
        Client client = new Client(name, mobile_number,text);
        clientRepository.save(client);
        System.out.println(client);
        return "redirect:/news";
    }

}
