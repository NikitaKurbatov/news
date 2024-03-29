package com.news.news.repo;

import com.news.news.models.Price;
import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface PriceRepository extends CrudRepository<Price, Long> {
    List<Price> findAll();

    List<Price> findByText(String text);


}
