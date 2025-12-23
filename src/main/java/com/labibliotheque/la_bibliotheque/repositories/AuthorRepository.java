package com.labibliotheque.la_bibliotheque.repositories;
import com.labibliotheque.la_bibliotheque.repositories.models.AuthorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity,Integer> {
    List<AuthorEntity> findByFirstNameAuthor(String firstname);
    List<AuthorEntity>findByLastNameAuthor(String laststname);
}
