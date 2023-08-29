package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.dto.Category;
import com.labibliotheque.la_bibliotheque.services.CategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "categories",produces = "application/json")
@Tag(name = "category api")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable("id")int id){
        return categoryService.getCategory(id).orElseThrow();
    }
    
    @GetMapping()
    public Iterable<Category>getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping()
    public void saveCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
    }
}
