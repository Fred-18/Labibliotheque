package com.labibliotheque.la_bibliotheque.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class SimpleBook {
    private int id;
    private String title;
    private String description;
    private boolean availability;
    private Date publishDate;

    private int idCategory;
    private int idPublisher;
    private  int idAuthor;
}
