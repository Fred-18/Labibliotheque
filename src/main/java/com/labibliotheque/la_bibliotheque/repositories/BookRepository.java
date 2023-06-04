package com.labibliotheque.la_bibliotheque.repositories;

import com.labibliotheque.la_bibliotheque.repositories.models.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,Integer>{
}
