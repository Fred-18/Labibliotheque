
package com.labibliotheque.la_bibliotheque.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstNameAuthor;
    private String lastNameAuthor;
    @ManyToMany(mappedBy = "authors")
    private List<Books> books;

}