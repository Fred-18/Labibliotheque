package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {
    @Autowired
    private BookService bs;
    
    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable("id")int id){
        return bs.getBook(id).orElseThrow();
    }
}
