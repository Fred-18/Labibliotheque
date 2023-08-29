package com.labibliotheque.la_bibliotheque.repositories.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date commentDate;
    private int ratting;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_book", referencedColumnName = "id")
    private BookEntity book;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private UserEntity user;
}
