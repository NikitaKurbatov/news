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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.awt.SystemColor.text;

@Controller
public class PriceController {
    @Autowired
    PriceRepository priceRepository;

    @GetMapping("/price")
    public String price (@RequestParam(value = "page", required = false, defaultValue = "0") Integer page, Model model){
        model.addAttribute("price", "Цены на услуги");
        Page<Price> pagePrices = priceRepository.findAll(PageRequest.of(page, 5));
        model.addAttribute("requested_page", pagePrices);
        model.addAttribute("numbers", IntStream.range(0, pagePrices.getTotalPages()).toArray());
        model.addAttribute("namePage", "/price");
        return "price";
    }
    @GetMapping("/price/{test}")
    public String priceSearch (@RequestParam(value = "page", required = false, defaultValue = "0") Integer page, @PathVariable(value = "text", required = false) String text, Model model){
//       if (text == "") {
           Page<Price> pagePrices = priceRepository.findByTextContains(text, PageRequest.of(page, 5));
           model.addAttribute("requested_page", pagePrices);
           model.addAttribute("numbers", IntStream.range(0, pagePrices.getTotalPages()).toArray());
           model.addAttribute("namePage", "/price");
           model.addAttribute("price", "Цены на услуги");
//       }
//       else {
//           Page<Price> pagePrices = priceRepository.findByTextContains(text);
//           model.addAttribute("requested_page", pagePrices);
//           model.addAttribute("numbers", IntStream.range(0, pagePrices.getTotalPages()).toArray());
//           model.addAttribute("namePage", "/price");
//           model.addAttribute("price", "Цены на услуги");
//        }
        return "redirect:/price";
    }

}
