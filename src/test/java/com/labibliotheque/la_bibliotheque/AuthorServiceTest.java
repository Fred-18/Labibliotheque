package com.labibliotheque.la_bibliotheque;

import com.labibliotheque.la_bibliotheque.mappers.AuthorMapper;
import com.labibliotheque.la_bibliotheque.models.Author;
import com.labibliotheque.la_bibliotheque.repositories.AuthorRepository;
import com.labibliotheque.la_bibliotheque.services.AuthorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest {
    @Mock
    public AuthorRepository repository;
    @Mock
    public AuthorMapper mappers;
    @InjectMocks
    public AuthorService service;
    @Test
    public void getAuthorMustCallAuthorRepoOnce(){
        service.getAuthor(1);

        Mockito.verify(repository,Mockito.times(1)).findById(1);
    }
}
