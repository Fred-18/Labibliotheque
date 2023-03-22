package com.labibliotheque.la_bibliotheque.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Publishers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String namePublisher;
    @OneToMany(mappedBy = "publishers")
    private List<Books> books;
}
