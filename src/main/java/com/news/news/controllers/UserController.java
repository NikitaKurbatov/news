package com.news.news.controllers;

import com.news.news.Entity.Role;
import com.news.news.models.Users;
import com.news.news.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/registration")
    public String registrationNewUser (@RequestParam String login, @RequestParam String password, @RequestParam String mobile_number, Model model){
        Users user = new Users(login, password, mobile_number, Role.USER);
        userRepository.save(user);
        return "redirect:/news";
    }
}
