package com.labibliotheque.la_bibliotheque.repository;

import com.labibliotheque.la_bibliotheque.model.Publishers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publishers,Integer> {
}
