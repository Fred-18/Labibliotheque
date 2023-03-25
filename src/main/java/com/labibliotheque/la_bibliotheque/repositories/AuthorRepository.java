package com.labibliotheque.la_bibliotheque.repositories;
import com.labibliotheque.la_bibliotheque.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Integer> {
    List<Author> findByFirstNameAuthor(String firstname);
    List<Author>findByLastNameAuthor(String laststname);
}
