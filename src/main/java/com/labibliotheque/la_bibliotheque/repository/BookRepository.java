package com.labibliotheque.la_bibliotheque.repository;

import com.labibliotheque.la_bibliotheque.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books,Integer>{
}
