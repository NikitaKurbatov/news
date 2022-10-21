package com.news.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.news.news.Config.OpenBrowser.openHomePage;

@SpringBootApplication
public class NewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsApplication.class, args);
//		SpringApplication.run(SecuringWebApplication.class, args);
//		openHomePage();
	}

}
