package com.news.news.controllers;

import com.news.news.models.Price;
import com.news.news.repo.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class PriceController {
    @Autowired
    PriceRepository priceRepository;

    @GetMapping("/price")
    public String price (Model model){
        model.addAttribute("price", "Цены на услуги");
        Iterable<Price> allprice = priceRepository.findAll();
        model.addAttribute("allprice", allprice);
        return "price";
    }
    @PostMapping("/search/price")
    public String priceSearch (@RequestParam String text, Model model){
       if (text.length() == 0) {
           Iterable<Price> allprice = priceRepository.findAll();
           model.addAttribute("price", "Цены на услуги");
           model.addAttribute("allprice", allprice);
       }
//       else {
//            Optional<Price> SearchUslug = priceRepository.findAllByFull_textContains(text);
//            model.addAttribute("allprice", SearchUslug);
//        }
        return "redirect:/price";
    }
}
