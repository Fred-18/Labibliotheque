package com.labibliotheque.la_bibliotheque.repository;

import com.labibliotheque.la_bibliotheque.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <Users, Integer>{
}
