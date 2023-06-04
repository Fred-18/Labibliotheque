package com.labibliotheque.la_bibliotheque.mappers;

import com.labibliotheque.la_bibliotheque.models.Publisher;
import com.labibliotheque.la_bibliotheque.repositories.models.PublisherEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface PublisherMapper {
    Publisher toDto(PublisherEntity publisherEntity);
    PublisherEntity toEntity(Publisher publisher);
    
}
