package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Publisher;
import com.labibliotheque.la_bibliotheque.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {
    @Autowired
    private PublisherService ps;
    
    @GetMapping("/publisher/{id}")
     public Publisher getPublisherById(int id){
        return ps.getPublisher(id).orElseThrow();
    }
    @GetMapping("/publishers")
     public Iterable<Publisher> getAllPublishers(){
        return ps.getAllPublishers();
    }
}
