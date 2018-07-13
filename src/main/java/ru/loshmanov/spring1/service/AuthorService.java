package ru.loshmanov.spring1.service;

import java.util.List;

import ru.loshmanov.spring1.entity.Author;

public interface AuthorService {

    Author get(Long id);

    List<Author> getAll();

    void save(Author author);

    void remove(Author author);

}
