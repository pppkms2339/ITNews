package ru.loshmanov.spring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.loshmanov.spring1.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
