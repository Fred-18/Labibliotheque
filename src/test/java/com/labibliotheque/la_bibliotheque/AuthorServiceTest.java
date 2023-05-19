package com.labibliotheque.la_bibliotheque;

import com.labibliotheque.la_bibliotheque.repositories.AuthorRepository;
import com.labibliotheque.la_bibliotheque.services.AuthorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest {
    @Mock
    public AuthorRepository repository;
    @InjectMocks
    public AuthorService service;
    @Test
    public void getAuthorMustCallAuthorRepoOnce(){
        service.getAuthor(1);
        Mockito.verify(repository,Mockito.times(1)).findById(1);
    }
}
