package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Publisher;
import com.labibliotheque.la_bibliotheque.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    @GetMapping("/publisher/{id}")
    public Publisher getPublisherById(@PathVariable int id) {
        return publisherService.getPublisher(id).orElseThrow();
    }

    @GetMapping("/publishers")
    public Iterable<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }

    @PostMapping("/publisher/add")
    public void savePublisher(@RequestBody Publisher publisher) {
        publisherService.addPublishers(publisher);
    }

    @DeleteMapping("/publisher/delete/{id}")
    public void deletePublisher(@PathVariable("id") int id) {
        publisherService.deletePublishers(id);
    }
}
