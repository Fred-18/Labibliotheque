package com.labibliotheque.la_bibliotheque.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Books {
    @Id
    @Column(name = "id_book")
    private int id;
    private String title;
    private String description;
    private boolean availability;
    private Date publishDate;

    @ManyToOne
    private Publishers publishers;
    @ManyToOne
    private Categories categories;
    @ManyToMany
    private List<Authors> authors;


}
