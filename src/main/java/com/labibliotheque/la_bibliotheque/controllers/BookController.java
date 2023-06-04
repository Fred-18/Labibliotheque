package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;
    
    @GetMapping("{id}")
    public Book getBookById(@PathVariable("id")int id){
        return bookService.getBook(id).orElseThrow();
    }
    
    @GetMapping("/")
    public Iterable<Book>getAllBooks(){
        return bookService.getAllBooks();
    }
    
    @PostMapping("add")
    public void saveBook(@RequestBody Book book){
        bookService.addBook(book);
    }
    @DeleteMapping("{id}")
    public void deleteBook(@PathVariable("id")int id){
        bookService.deleteBook(id);
    }
}

