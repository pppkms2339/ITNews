package ru.loshmanov.spring1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.loshmanov.spring1.entity.Author;
import ru.loshmanov.spring1.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepo;

    @Override
    @Transactional(readOnly = true)
    public Author get(Long id) {
        return authorRepo.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Author> getAll() {
        return authorRepo.findAll();
    }

    @Override
    @Transactional
    public void save(Author author) {
        authorRepo.save(author);
    }

    @Override
    @Transactional
    public void remove(Author author) {
        authorRepo.delete(author);
    }

}
