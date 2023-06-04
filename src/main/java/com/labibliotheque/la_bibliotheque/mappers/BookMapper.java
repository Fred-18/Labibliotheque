package com.labibliotheque.la_bibliotheque.mappers;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.repositories.models.BookEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface BookMapper {
    Book toDto(BookEntity BookEntity);
    BookEntity toEntity(Book Book);
    
}
