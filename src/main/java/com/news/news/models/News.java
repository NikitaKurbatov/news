package com.news.news.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class News {
    @Id
    private long id;

    private String title, anons, full_text;
    private int views;
    private String date_news;

    public News(String title, String anons, String full_text) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
    }

    public News() {
    }
}
