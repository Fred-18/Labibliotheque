package com.labibliotheque.la_bibliotheque.models;

import java.util.Date;

public class SimpleBook {
    private int id;
    private String title;
    private String description;
    private boolean availability;
    private Date publishDate;

    private int idCategory;
    private int idPublisher;
}
