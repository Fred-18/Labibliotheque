package com.labibliotheque.la_bibliotheque.repositories;

import com.labibliotheque.la_bibliotheque.models.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher,Integer> {
}
