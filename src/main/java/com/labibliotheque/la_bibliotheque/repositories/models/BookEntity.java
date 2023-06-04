package com.labibliotheque.la_bibliotheque.repositories.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class BookEntity {
    @Id
    private int id;
    private String title;
    private String description;
    private boolean availability;
    private Date publishDate;

    @ManyToOne
    private PublisherEntity publisher;
    @ManyToOne
    private CategoryEntity category;
    @ManyToMany
    private List<AuthorEntity> authors;
}
