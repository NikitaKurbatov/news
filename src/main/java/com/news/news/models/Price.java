package com.news.news.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Price {
    @Id
    private long id;
    private String price, text, full_text;

    public Price() {
    }

    public Price(String text, String full_text, String price) {
        this.text = text;
        this.full_text = full_text;
        this.price = price;
    }
}

