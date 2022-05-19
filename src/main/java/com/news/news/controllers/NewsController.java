package com.news.news.controllers;

import com.news.news.models.News;
import com.news.news.repo.NewsRepository;
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
    @GetMapping("/news/add")
    public String newsAdd (Model model){
        return "news-add";
    }
    @PostMapping("/news/add")
    public String newsNewsAdd (@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model){
        News news = new News(title, anons, full_text);
        newsRepository.save(news);
        return "redirect:/news";
    }
    @GetMapping("/news/{id}")
    public String newsDetails (@PathVariable(value = "id") long id, Model model){
        if (!newsRepository.existsById(id)){
            return "redirect:/news";
        }else{
            Optional <News> news = newsRepository.findById(id);
            ArrayList<News> result = new ArrayList<>();
            news.ifPresent(result::add);
            model.addAttribute("news", result);
            return "news-details";
        }
    }
    @GetMapping("/news/{id}/edit")
    public String newsEdit (@PathVariable(value = "id") long id, Model model){
        if (!newsRepository.existsById(id)){
            return "redirect:/news";
        }else{
            Optional <News> news = newsRepository.findById(id);
            ArrayList<News> result = new ArrayList<>();
            news.ifPresent(result::add);
            model.addAttribute("news", result);
            return "news-edit";
        }
    }
    @PostMapping("/news/{id}/edit")
    public String newsUpdate (@PathVariable(value = "id") long id, @RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model){
        News news = newsRepository.findById(id).orElseThrow();
        news.setTitle(title);
        news.setAnons(anons);
        news.setFull_text(full_text);
        newsRepository.save(news);
        return "redirect:/news";
    }
    @PostMapping("/news/{id}/remove")
    public String newsDelete (@PathVariable(value = "id") long id, Model model){
        newsRepository.deleteById(id);
        return "redirect:/news";
    }

}
