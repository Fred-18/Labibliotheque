package com.labibliotheque.la_bibliotheque.dto;

import lombok.Data;
import java.util.Date;

@Data
public class Book {
    private int id;
    private String title;
    private String description;
    private boolean availability;
    private Date publishDate;
    private  Publisher publisher;
    private Category category;
    private Author author;


}

