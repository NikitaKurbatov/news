package com.news.news.repo;

import com.news.news.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    String findByLoginAndPassword(String login, String password);

    String findByLogin (String login);
    User findById(long id);

}
