package com.labibliotheque.la_bibliotheque.repository;

import com.labibliotheque.la_bibliotheque.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Categories,Integer> {
}
