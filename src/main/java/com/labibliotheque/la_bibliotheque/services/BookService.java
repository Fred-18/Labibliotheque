package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bs;
    
    public Optional<Book>getBook(int id){
        return bs.findById(id);
    }
    public Iterable<Book>getAllBooks(){
        return bs.findAll();
    }
    public void addBook(Book book){
        bs.save(book);
    }
    public void deleteBook(Book book){
        bs.delete(book);
    }
}