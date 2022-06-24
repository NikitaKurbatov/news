package com.news.news.models;

import com.news.news.Entity.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    @Id
    private long id;

    private String login, password;

    private Role role;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

}

