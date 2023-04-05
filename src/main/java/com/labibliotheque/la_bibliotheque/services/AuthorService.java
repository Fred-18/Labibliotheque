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
    AuthorRepository ar;

    public Optional<Author> getAuthor(int id) {
        return ar.findById(id);
    }

    public Iterable<Author> getAllAuthors() {
        return ar.findAll();
    }

    public void addAuthor(Author author) {
        ar.save(author);
    }

    public void deleteAuthor(int id) {
        ar.deleteById(id);
    }

    public List<Author> getAuthorByFirstName(String firstname) {
        return ar.findByFirstNameAuthor(firstname);
    }

    public List<Author> getAuthorByLastName(String lastname) {
        return ar.findByLastNameAuthor(lastname);
    }
}
