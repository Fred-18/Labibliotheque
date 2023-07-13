package com.labibliotheque.la_bibliotheque.mappers;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.repositories.models.BookEntity;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface BookMapper {
    Book toDto(BookEntity BookEntity);
    @Mapping(target = "publisher.id",source="idPublisher")
    BookEntity toEntity(Book Book);
}
