package com.news.news.repo;

import com.news.news.models.Price;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PriceRepository extends CrudRepository<Price, Integer> {
//    Optional<Price> findAllByFull_textContains(String text);
}
