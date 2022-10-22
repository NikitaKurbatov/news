package com.news.news.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry){
//        registry.addViewController("/").setViewName("home");
//        registry.addViewController("/home").setViewName("home");
//        registry.addViewController("/about").setViewName("about");
//        registry.addViewController("/news").setViewName("news");
//        registry.addViewController("/partners").setViewName("partners");
        registry.addViewController("/login").setViewName("login");
    }

}
