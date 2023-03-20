package com.labibliotheque.la_bibliotheque.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Books {
    @Id
    @Column(name = "id_book")
    private int idBook;
    private String title;
    private String description;
    private boolean availability;
    private Date publishDate;
    private int rating;

}
