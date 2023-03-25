package com.labibliotheque.la_bibliotheque.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    private int id;
    private String nameCategory;

    @OneToMany(mappedBy = "categories")
    private List<Book> books;


}
