package com.labibliotheque.la_bibliotheque.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Role {
    @Id
    private int idRole;
    private String labelRole;

}
