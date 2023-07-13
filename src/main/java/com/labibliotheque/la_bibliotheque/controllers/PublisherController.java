package com.labibliotheque.la_bibliotheque.controllers;

import com.labibliotheque.la_bibliotheque.models.Publisher;
import com.labibliotheque.la_bibliotheque.services.PublisherService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "publishers",produces = "application/json")
@Tag(name = "publisher api")
public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    @GetMapping("/{id}")
    public Publisher getPublisherById(@PathVariable int id) {
        return publisherService.getPublisher(id).orElseThrow();
    }

    @GetMapping()
    public Iterable<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }

    @PostMapping()
    public void savePublisher(@RequestBody Publisher publisher) {
        publisherService.addPublishers(publisher);
    }

    @DeleteMapping("/{id}")
    public void deletePublisher(@PathVariable("id") int id) {
        publisherService.deletePublishers(id);
    }
}
