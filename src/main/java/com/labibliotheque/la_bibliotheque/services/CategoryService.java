package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.mappers.CategoryMapper;
import com.labibliotheque.la_bibliotheque.models.Category;
import com.labibliotheque.la_bibliotheque.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service

public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
            
    CategoryRepository categoryRepository;
    
    public Optional<Category> getCategory(int id){
        return categoryRepository.findById(id).map(categoryMapper::toDto);
    }
    public Iterable<Category>getAllCategories() {
        return StreamSupport.stream(categoryRepository.findAll().spliterator(), false)
                .map(categoryMapper::toDto)
                .collect(Collectors.toList());
    }

    public void addCategory(Category category){
        categoryRepository.save(categoryMapper.toEntity(category));
    }
}
