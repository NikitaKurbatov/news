package com.news.news.models;

import com.news.news.Entity.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    @Id
    private long id;
    private String login, password, mobile_number;

    private String role;

    public User(String login, String password, String mobile_number, String role) {
        this.login = login;
        this.password = password;
        this.mobile_number = mobile_number;
        this.role = role;
    }

    public User() {
    }

}

