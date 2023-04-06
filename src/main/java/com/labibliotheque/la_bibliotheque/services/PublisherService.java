package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.models.Publisher;
import com.labibliotheque.la_bibliotheque.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PublisherService {
    @Autowired
    PublisherRepository publisherRepository;
    
    public Optional<Publisher>getPublisher(int id){
        return publisherRepository.findById(id);
    }
    public Iterable<Publisher>getAllPublishers(){
        return publisherRepository.findAll();
    }
    public void addPublishers(Publisher publisher){
        publisherRepository.save(publisher);
    }
    public void deletePublishers(int id){
        publisherRepository.deleteById(id);
    }
}