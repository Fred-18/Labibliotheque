package com.labibliotheque.la_bibliotheque.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Authors {
    @Id
    private int idAuthor;
    private String firstNameAuthor;
    private String lastNameAuthor;

}
