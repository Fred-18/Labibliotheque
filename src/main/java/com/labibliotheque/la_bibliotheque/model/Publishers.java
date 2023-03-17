package com.labibliotheque.la_bibliotheque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Publishers {
    @Id
    private int idPublisher;
    private String namePublisher;
}
