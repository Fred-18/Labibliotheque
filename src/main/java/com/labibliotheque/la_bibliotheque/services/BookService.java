package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.mappers.AuthorMapper;
import com.labibliotheque.la_bibliotheque.mappers.BookMapper;
import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookRepository bookRepository;
    
    
    public Optional<Book>getBook(int id){
        return bookRepository.findById(id).map(bookMapper::toDto);
    }
    public Iterable<Book>getAllBooks(){
        return StreamSupport.stream(bookRepository.findAll().spliterator(), false)
                .map(bookMapper::toDto)
                .collect(Collectors.toList());
    }
    
    public void addBook(Book book){
        bookRepository.save(bookMapper.toEntity(book));
    }
    public void deleteBook(int id){
        bookRepository.deleteById(id);
    }
}
