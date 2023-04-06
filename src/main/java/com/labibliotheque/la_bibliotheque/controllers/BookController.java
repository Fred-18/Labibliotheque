package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    
    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable("id")int id){
        return bookService.getBook(id).orElseThrow();
    }
    
    @GetMapping("/books")
    public Iterable<Book>getAllBooks(){
        return bookService.getAllBooks();
    }
    
    @PostMapping("/book/add")
    public void saveBook(@RequestBody Book book){
        bookService.addBook(book);
    }
    @DeleteMapping("/book/delete/{id}")
    public void deleteBook(@PathVariable("id")Book book){
        bookService.deleteBook(book);
    }
}

