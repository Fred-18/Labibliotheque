package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Category;
import com.labibliotheque.la_bibliotheque.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("/category/{id}")
    public Category getCategoryById(@PathVariable("id")int id){
        return categoryService.getCategory(id).orElseThrow();
    }
    
    @GetMapping("/categories")
    public Iterable<Category>getAllCategories(){
        return categoryService.getAllCategories();
    }
}
