package com.labibliotheque.la_bibliotheque.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Comment {
    @Id
    private int id;
    private Date commentDate;
    private int ratting;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_book", referencedColumnName = "id")
    private Book book;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private User user;
}
