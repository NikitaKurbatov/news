package com.news.news.controllers;

import com.news.news.models.News;
import com.news.news.repo.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/news")
    public String news (Model model){
        model.addAttribute("news", "Новости");
        Iterable<News> news = newsRepository.findAll();
        model.addAttribute("allnews", news);
        return "news";
    }

}
