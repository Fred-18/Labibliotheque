package com.labibliotheque.la_bibliotheque.repositories.models;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;


@Data
@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private boolean availability;
    private Date publishDate;

    @ManyToOne
    private PublisherEntity publisher;
    @ManyToOne
    private CategoryEntity category;
    @ManyToOne
    private AuthorEntity author;
    @OneToOne
    private UserEntity user;
}
