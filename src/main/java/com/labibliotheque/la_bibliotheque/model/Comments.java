package com.labibliotheque.la_bibliotheque.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Comments {
    @Id
    private int idComment;
    private Date commentDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_book", referencedColumnName = "id_book")
    private Books books;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private Users users;
}
