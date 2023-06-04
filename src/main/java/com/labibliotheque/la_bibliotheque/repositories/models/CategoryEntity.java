package com.labibliotheque.la_bibliotheque.repositories.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {
    @Id
    private int id;
    private String nameCategory;

    @OneToMany(mappedBy = "category")
    private List<BookEntity> books;


}
