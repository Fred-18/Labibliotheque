package com.labibliotheque.la_bibliotheque.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Book {
    @Id
    private int id;
    private String title;
    private String description;
    private boolean availability;
    private Date publishDate;
    
    @ManyToOne
    private Publisher publisher;
    @ManyToOne
    private Category category;
    @ManyToMany
    private List<Author> authors;
}
