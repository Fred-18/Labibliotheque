package com.labibliotheque.la_bibliotheque.repositories.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class RoleEntity {
    @Id
    private int idRole;
    private String labelRole;

    @OneToMany(mappedBy = "role")
    private List<UserEntity> users;
}
