package com.labibliotheque.la_bibliotheque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Comments {
    @Id
    private int idComment;
    private Date commentDate;
}
