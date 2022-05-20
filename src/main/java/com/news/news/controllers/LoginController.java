package com.news.news.controllers;

import com.news.news.models.Login;
import com.news.news.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
public class LoginController {
    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/login")
    public String login (Model model){
        return "login";
    }

    @PostMapping("/login")
    public String login (@RequestParam (value = "login") String login, @RequestParam (value = "password") String password){
        //Login logs = new Login(login, password);
        Iterable<Login> log = loginRepository.findAll();
        //for (String el: list) {
            System.out.println(log.iterator().toString());
        //}


       // loginRepository.save(log2);
        return "redirect:/news";
    }
}
