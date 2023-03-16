package com.labibliotheque.la_bibliotheque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

    @Data
    @Entity
    public class Users {
        @jakarta.persistence.Id
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String firstname;
        private String lastname;
        private String password;
        private String mail;
        private int phone;
        private String addresse;
        private int age;


    }
