package com.labibliotheque.la_bibliotheque.services;

import com.labibliotheque.la_bibliotheque.mappers.PublisherMapper;
import com.labibliotheque.la_bibliotheque.dto.Publisher;
import com.labibliotheque.la_bibliotheque.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PublisherService {
    @Autowired
    PublisherMapper publisherMapper;
    @Autowired
    PublisherRepository publisherRepository;
    
    public Optional<Publisher>getPublisher(int id){
        return publisherRepository.findById(id).map(publisherMapper::toDto);
    }
    public Iterable<Publisher>getAllPublishers(){
        return StreamSupport.stream(publisherRepository.findAll().spliterator(), false)
                .map(publisherMapper::toDto)
                .collect(Collectors.toList());
    }
    
    public void addPublishers(Publisher publisher){
        publisherRepository.save(publisherMapper.toEntity(publisher));
    }
    public void deletePublishers(int id){
        publisherRepository.deleteById(id);
    }
}
