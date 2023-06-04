package com.labibliotheque.la_bibliotheque.models;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Author {
    private int id;
    private String firstNameAuthor;
    private String lastNameAuthor;

}
