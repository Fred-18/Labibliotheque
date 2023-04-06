package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.models.Author;
import com.labibliotheque.la_bibliotheque.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public Optional<Author> getAuthor(int id) {
        return authorRepository.findById(id);
    }

    public Iterable<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);
    }

    public List<Author> getAuthorByFirstName(String firstname) {
        return authorRepository.findByFirstNameAuthor(firstname);
    }

    public List<Author> getAuthorByLastName(String lastname) {
        return authorRepository.findByLastNameAuthor(lastname);
    }
}
