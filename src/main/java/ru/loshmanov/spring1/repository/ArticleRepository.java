package ru.loshmanov.spring1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ru.loshmanov.spring1.entity.Article;

@Repository
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {

    @Query("SELECT a FROM Article a WHERE a.category.id=:id")
    public Page<Article> findByCategoryId(@Param("id") Long id, Pageable pageable);

}
