package com.labibliotheque.la_bibliotheque.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstNameAuthor;
    private String lastNameAuthor;
    @ManyToMany(mappedBy = "authors")
    private List<Book> books;

}
