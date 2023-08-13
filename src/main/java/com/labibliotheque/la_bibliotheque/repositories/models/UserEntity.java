package com.labibliotheque.la_bibliotheque.repositories.models;

import com.labibliotheque.la_bibliotheque.models.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String password;
    @Transient
    private String passwordConfimr;
    private String mail;
    private int phone;
    private String address;
    private int age;


    private Role role;
}   
    
