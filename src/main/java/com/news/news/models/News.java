package com.news.news.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.DateFormat;

@Entity
@Getter
@Setter
public class News {
    @Id
    private long id;

    private String title, anons, full_text;
    private int views;
    private String date_news;

    public News(String title, String anons, String full_text, String date_news) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
        this.date_news = date_news;
    }

    public News() {
    }
}
