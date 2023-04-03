package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Author;
import com.labibliotheque.la_bibliotheque.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService as;


    @GetMapping("/author/{id}")
    public Author getAuthorById(@PathVariable("id") int id){
        return as.getAuthor(id).orElseThrow();
    }
    @GetMapping("/authors/")
    public Iterable<Author>getAllAuthors(){
        return as.getAllAuthors();
    }
    @GetMapping("/author/{firstName}")
    public List <Author> getAuthorByFirstName(@PathVariable("firstname")String firstName){
        return as.getAuthorByFirstName(firstName);
    }@GetMapping("/author/{lastName}")
    public List <Author> getAuthorByLastName(@PathVariable("lastname")String lastName){
        return as.getAuthorByLastName(lastName);
    }
    @PostMapping("/author/add")
    public void saveAuthor(@RequestBody Author author){
        as.addAuthor(author);
    }
    @PostMapping("/author/delete")
    public void deleteAuthor(@PathVariable("id") Author author){
        as.deleteAuthor(author);
    }
}
