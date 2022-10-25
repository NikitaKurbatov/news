package com.news.news.repo;

import com.news.news.models.Price;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PriceRepository extends CrudRepository<Price, Integer> {
    Page<Price> findAll(Pageable pageable);
}
