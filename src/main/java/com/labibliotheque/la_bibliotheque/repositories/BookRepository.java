package com.labibliotheque.la_bibliotheque.repositories;

import com.labibliotheque.la_bibliotheque.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer>{
}
