package com.labibliotheque.la_bibliotheque.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class User {
        private int id;
        private String firstname;
        private String lastname;
        private String password;
        private String passwordConfirm;
        private String mail;
        private int phone;
        private String address;
        private int age;
        private Role role;
    }   
    
