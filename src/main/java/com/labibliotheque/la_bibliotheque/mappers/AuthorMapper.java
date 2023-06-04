package com.labibliotheque.la_bibliotheque.mappers;

import com.labibliotheque.la_bibliotheque.models.Author;
import com.labibliotheque.la_bibliotheque.repositories.models.AuthorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface AuthorMapper {
    Author toDto(AuthorEntity authorEntity);
    AuthorEntity toEntity(Author author);
    
}
