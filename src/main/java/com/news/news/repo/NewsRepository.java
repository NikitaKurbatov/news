package com.news.news.repo;

import com.news.news.models.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Long> {
    Page<News> findAll(Pageable pageable);

}
