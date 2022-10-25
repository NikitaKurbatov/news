package com.news.news.controllers;

import com.news.news.models.News;
import com.news.news.models.Price;
import com.news.news.repo.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.stream.IntStream;

@Controller
public class PriceController {
    @Autowired
    PriceRepository priceRepository;

    @GetMapping("/price")
    public String price (@RequestParam(value = "page", required = false, defaultValue = "0") Integer page, Model model){
        model.addAttribute("price", "Цены на услуги");
        Page<Price> pagePrices = priceRepository.findAll(PageRequest.of(page, 5));
        model.addAttribute("pagePrices", pagePrices);
        model.addAttribute("numbers", IntStream.range(0, pagePrices.getTotalPages()).toArray());
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
    @PostMapping("/servise_add")
    public String serviseAdd (@RequestParam String text, @RequestParam String full_text, @RequestParam String price, Model model){
        Price servise = new Price(text, full_text, price);
        priceRepository.save(servise);
        return "redirect:/price";
    }
}
