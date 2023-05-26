package com.estagio.persisti.services;

import com.estagio.persisti.entities.Category;
import com.estagio.persisti.entities.Product;
import com.estagio.persisti.entities.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

    public Category create(Category category) {
        return repository.save(category);
    }
}
