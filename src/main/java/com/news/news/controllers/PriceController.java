package com.news.news.controllers;

import com.news.news.models.Price;
import com.news.news.models.User;
import com.news.news.repo.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PriceController {
    @Autowired
    PriceRepository priceRepository;

    @GetMapping("/price")
    public String price (Model model){
        model.addAttribute("price", "Цена");
        Iterable<Price> allprice = priceRepository.findAll();
        model.addAttribute("allprice", allprice);
        return "price";
    }
}
