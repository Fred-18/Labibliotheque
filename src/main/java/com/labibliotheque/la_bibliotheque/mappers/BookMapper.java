package com.labibliotheque.la_bibliotheque.mappers;

import com.labibliotheque.la_bibliotheque.dto.Book;
import com.labibliotheque.la_bibliotheque.dto.SimpleBook;
import com.labibliotheque.la_bibliotheque.repositories.models.BookEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;




@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toDto(BookEntity BookEntity);

    @Mapping(target = "category.id", source = "idCategory")
    @Mapping(target = "publisher.id", source = "idPublisher")
    @Mapping(target = "author.id", source = "idAuthor")
    BookEntity toEntity(SimpleBook Book);


}
