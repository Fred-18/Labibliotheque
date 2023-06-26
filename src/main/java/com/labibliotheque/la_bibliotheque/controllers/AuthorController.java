package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Author;
import com.labibliotheque.la_bibliotheque.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;


    @GetMapping("{id}")
    public Author getAuthorById(@PathVariable("id") int id){
        return authorService.getAuthor(id).orElseThrow();
    }
    @GetMapping("/")
    public Iterable<Author>getAllAuthors(){
        return authorService.getAllAuthors();
    }
    @GetMapping("{firstName}")
    public List <Author> getAuthorByFirstName(@PathVariable("firstName")String firstName){
        return authorService.getAuthorByFirstName(firstName);
    }@GetMapping("{lastName}")
    public List <Author> getAuthorByLastName(@PathVariable("lastName")String lastName){
        return authorService.getAuthorByLastName(lastName);
    }
    @PostMapping("/")
    public void saveAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
    }
    @DeleteMapping("{id}")
    public void deleteAuthor(@PathVariable("id")int id){
        authorService.deleteAuthor(id);
    }
}
