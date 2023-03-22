package com.labibliotheque.la_bibliotheque.model;

import jakarta.persistence.*;
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
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id Publisher",referencedColumnName = "id")
    private Publishers publishers;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id Categories",referencedColumnName = "id")
    private Categories categories;
}
