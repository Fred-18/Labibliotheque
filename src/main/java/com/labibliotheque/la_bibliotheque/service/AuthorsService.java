package com.labibliotheque.la_bibliotheque.service;

import com.labibliotheque.la_bibliotheque.model.Authors;
import com.labibliotheque.la_bibliotheque.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorsService {
    @Autowired
    AuthorRepository ar;
    
    public Optional<Authors>getAuthor(int id){
        return ar.findById(id);
    }
    public Iterable<Authors>getAllAuthors(){
        return ar.findAll();
    }
    public void addAuthor(Authors authors){
         ar.save(authors);
    }
    public void deleteAuthor(Authors authors){
        ar.delete(authors);
    }
}