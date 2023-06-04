package com.labibliotheque.la_bibliotheque.repositories.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstNameAuthor;
    private String lastNameAuthor;
    @ManyToMany(mappedBy = "authors")
    private List<BookEntity> books;

}
