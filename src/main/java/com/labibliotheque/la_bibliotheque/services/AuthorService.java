package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.mappers.AuthorMapper;
import com.labibliotheque.la_bibliotheque.models.Author;
import com.labibliotheque.la_bibliotheque.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class AuthorService {
    @Autowired
    AuthorMapper authorMapper;
    @Autowired
    AuthorRepository authorRepository;

    public Optional<Author> getAuthor(int id) {
        return authorRepository.findById(id) .map(authorMapper::toDto);
    }

    public Iterable<Author> getAllAuthors() {
        return StreamSupport.stream(authorRepository.findAll().spliterator(), false)
                .map(authorMapper::toDto)
                .collect(Collectors.toList());
    }

    public void addAuthor(Author author) {
        authorRepository.save(authorMapper.toEntity(author));
    }

    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);
    }

    public List<Author> getAuthorByFirstName(String firstname) {
        return authorRepository.findByFirstNameAuthor(firstname).stream().map(authorMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<Author> getAuthorByLastName(String lastname) {
        return authorRepository.findByLastNameAuthor(lastname).stream().map(authorMapper::toDto)
                .collect(Collectors.toList());
    }
}
