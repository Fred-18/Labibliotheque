package com.labibliotheque.la_bibliotheque.mappers;

import com.labibliotheque.la_bibliotheque.models.Book;
import com.labibliotheque.la_bibliotheque.models.SimpleBook;
import com.labibliotheque.la_bibliotheque.repositories.models.BookEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toDto(BookEntity BookEntity);

    @Mapping(target = "category.id", source = "idCategory")
    @Mapping(target = "publisher.id", source = "idPublisher")
    BookEntity toEntity(SimpleBook Book);
}
