package com.news.news.repo;

import com.news.news.models.Price;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PriceRepository extends CrudRepository<Price, Integer> {
    Page<Price> findAll(Pageable pageable);
    Page<Price> findByTextContains(String text, Pageable pageable);
}
