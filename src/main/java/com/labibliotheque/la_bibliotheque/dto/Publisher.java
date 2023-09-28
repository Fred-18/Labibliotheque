package com.labibliotheque.la_bibliotheque.dto;

import lombok.Data;
import java.util.List;

@Data
public class Publisher {
    private int id;
    private String namePublisher;
    private List<Book> books;
}
