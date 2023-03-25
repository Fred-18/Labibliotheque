package com.labibliotheque.la_bibliotheque.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Role {
    @Id
    private int idRole;
    private String labelRole;

    @OneToMany(mappedBy = "role")
    private List<User> users;
}
