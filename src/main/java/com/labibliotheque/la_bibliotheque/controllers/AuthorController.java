package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Author;
import com.labibliotheque.la_bibliotheque.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;


    @GetMapping("/author/{id}")
    public Author getAuthorById(@PathVariable("id") int id){
        return authorService.getAuthor(id).orElseThrow();
    }
    @GetMapping("/authors/")
    public Iterable<Author>getAllAuthors(){
        return authorService.getAllAuthors();
    }
    @GetMapping("/author/{firstName}")
    public List <Author> getAuthorByFirstName(@PathVariable("firstName")String firstName){
        return authorService.getAuthorByFirstName(firstName);
    }@GetMapping("/author/{lastName}")
    public List <Author> getAuthorByLastName(@PathVariable("lastName")String lastName){
        return authorService.getAuthorByLastName(lastName);
    }
    @PostMapping("/author/add")
    public void saveAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
    }
    @PostMapping("/author/delete/{id}")//deleteMapping
    public void deleteAuthor(@PathVariable("id")int id){
        authorService.deleteAuthor(id);
    }
}
