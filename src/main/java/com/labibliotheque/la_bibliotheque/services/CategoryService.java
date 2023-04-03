package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.models.Category;
import com.labibliotheque.la_bibliotheque.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CategoryService {
    @Autowired
    CategoryRepository cr;
    
    public Optional<Category> getCategory(int id){
        return cr.findById(id);
    }
    public Iterable<Category>getAllCategories(){
        return cr.findAll();
    }
    
}