package ru.loshmanov.spring1.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ru.loshmanov.spring1.entity.Article;

public interface ArticleService {

    Page<Article> getAll(Pageable pageable);

    Article get(Long id);

    void save(Article article);

    Page<Article> getByCategoryId(Long id, Pageable pageable);

    void update(Article article);

    void delete(Long id);

}
