package com.labibliotheque.la_bibliotheque.repositories;

import com.labibliotheque.la_bibliotheque.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Integer>{
}
