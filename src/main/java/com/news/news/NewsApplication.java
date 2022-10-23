package com.news.news;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.news.news.Config.OpenBrowser.openHomePage;

@SpringBootApplication
public class NewsApplication {
	static final Logger log = LoggerFactory.getLogger(NewsApplication.class);
	public static void main(String[] args) {
		log.info("Before Starting application");
		SpringApplication.run(NewsApplication.class, args);
//		SpringApplication.run(SecuringWebApplication.class, args);
//		openHomePage();
	}

}
