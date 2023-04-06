package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    
    public Optional<Book>getBook(int id){
        return bookRepository.findById(id);
    }
    public Iterable<Book>getAllBooks(){
        return bookRepository.findAll();
    }
    public void addBook(Book book){
        bookRepository.save(book);
    }
    public void deleteBook(Book book){
        bookRepository.delete(book);
    }
}