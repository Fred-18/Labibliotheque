package com.labibliotheque.la_bibliotheque.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String namePublisher;
    @OneToMany(mappedBy = "publishers")
    private List<Book> books;
}
