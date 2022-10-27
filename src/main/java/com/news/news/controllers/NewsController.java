package com.news.news.controllers;

import com.news.news.models.News;
import com.news.news.repo.NewsRepository;
import org.junit.rules.Timeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@Controller
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/news")
    public String news (@RequestParam(value = "page", required = false, defaultValue = "0") Integer page, Model model) throws InterruptedException {
        model.addAttribute("news", "Новости");
        Page<News> pageNews = newsRepository.findAll(PageRequest.of(page, 2));
        model.addAttribute("requested_page", pageNews);
//        TimeUnit.SECONDS.sleep(5);
        model.addAttribute("numbers", IntStream.range(0, pageNews.getTotalPages()).toArray());
        model.addAttribute("namePage", "/news");
        return "news";
    }

}
