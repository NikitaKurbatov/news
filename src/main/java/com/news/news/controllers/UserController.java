package com.news.news.controllers;

import com.news.news.models.News;
import com.news.news.models.User;
import com.news.news.repo.UserRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/registration")
    public String openRegistration (Model model){
        model.addAttribute("registration", "Регистрация");
        return "/registration";
    }
    @PostMapping("/registration")
    public String registrationNewUser (@RequestParam String login, @RequestParam String password, @RequestParam String password_2, @RequestParam String mobile_number, Model model){
        if (password == password_2){
            if (!userRepository.findByLogin(login).isEmpty()){
//                model.addAttribute("error", "Такой логин уже есть");
            }else{
                User user = new User(login, password, mobile_number);
                userRepository.save(user);
            }
        }else{
            model.addAttribute("error", "Пароли не совпадают!");
        }
        return "redirect:/news";
    }
}
