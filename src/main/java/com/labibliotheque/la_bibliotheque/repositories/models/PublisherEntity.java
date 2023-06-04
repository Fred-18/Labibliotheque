package com.labibliotheque.la_bibliotheque.repositories.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class PublisherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String namePublisher;
    @OneToMany(mappedBy = "publisher")
    private List<BookEntity> books;
}
