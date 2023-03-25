package com.labibliotheque.la_bibliotheque.service;

import com.labibliotheque.la_bibliotheque.model.Publishers;
import com.labibliotheque.la_bibliotheque.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PublisherService {
    @Autowired
    PublisherRepository ps;
    
    public Optional<Publishers>getPublisher(int id){
        return ps.findById(id);
    }
    public Iterable<Publishers>getAllPublisher(){
        return ps.findAll();
    }
    public void addPublishers(Publishers publishers){
        ps.save(publishers);
    }
    public void deletePublishers(Publishers publishers){
        ps.delete(publishers);
    }
}