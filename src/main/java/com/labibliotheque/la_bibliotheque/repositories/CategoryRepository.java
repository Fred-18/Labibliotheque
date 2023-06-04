package com.labibliotheque.la_bibliotheque.repositories;

import com.labibliotheque.la_bibliotheque.repositories.models.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {
}
