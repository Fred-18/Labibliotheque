package com.labibliotheque.la_bibliotheque.models;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.models.User;
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
