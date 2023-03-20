package com.labibliotheque.la_bibliotheque.repository;
import com.labibliotheque.la_bibliotheque.model.Authors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Authors,Integer> {
}
