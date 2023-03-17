package com.labibliotheque.la_bibliotheque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Categories {
    @Id
    private int idCategory;
    private String nameCategory;

}
