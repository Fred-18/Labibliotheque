package com.labibliotheque.la_bibliotheque.service;

import com.labibliotheque.la_bibliotheque.model.Books;
import com.labibliotheque.la_bibliotheque.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BooksService {
    @Autowired
    BookRepository bs;
    
    public Optional<Books>getBook(int id){
        return bs.findById(id);
    }
    public Iterable<Books>getAllBooks(){
        return bs.findAll();
    }
    public void addBook(Books books){
        bs.save(books);
    }
    public void deleteBook(Books books){
        bs.delete(books);
    }
}