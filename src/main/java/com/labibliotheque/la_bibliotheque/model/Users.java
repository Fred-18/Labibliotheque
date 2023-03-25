package com.labibliotheque.la_bibliotheque.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    public class Users {
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