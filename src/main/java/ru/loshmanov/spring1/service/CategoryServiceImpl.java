package ru.loshmanov.spring1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.loshmanov.spring1.entity.Category;
import ru.loshmanov.spring1.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    @Override
    @Transactional(readOnly = true)
    public Category get(Long id) {
        return categoryRepo.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    @Override
    @Transactional
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    @Transactional
    public void remove(Category category) {
        categoryRepo.delete(category);
    }

}
