package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.models.Publisher;
import com.labibliotheque.la_bibliotheque.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PublisherService {
    @Autowired
    PublisherRepository ps;
    
    public Optional<Publisher>getPublisher(int id){
        return ps.findById(id);
    }
    public Iterable<Publisher>getAllPublisher(){
        return ps.findAll();
    }
    public void addPublishers(Publisher publisher){
        ps.save(publisher);
    }
    public void deletePublishers(Publisher publisher){
        ps.delete(publisher);
    }
}