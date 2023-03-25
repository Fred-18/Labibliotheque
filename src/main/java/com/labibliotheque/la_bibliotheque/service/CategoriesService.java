package com.labibliotheque.la_bibliotheque.service;

import com.labibliotheque.la_bibliotheque.model.Categories;
import com.labibliotheque.la_bibliotheque.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriesService {
    @Autowired
    CategoryRepository cr;
    
    public Optional<Categories>getCathegorie(int id){
        return cr.findById(id);
    }
    public Iterable<Categories>getAllCathegories(){
        return cr.findAll();
    }
    
}