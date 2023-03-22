package com.labibliotheque.la_bibliotheque.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Categories {
    @Id
    private int id;
    private String nameCategory;

    @OneToMany(mappedBy = "categories")
    private List<Books> books;


}
