package ru.loshmanov.spring1.service;

import java.util.List;

import ru.loshmanov.spring1.entity.Category;

public interface CategoryService {

    Category get(Long id);

    List<Category> getAll();

    void save(Category category);

    void remove(Category category);

}
