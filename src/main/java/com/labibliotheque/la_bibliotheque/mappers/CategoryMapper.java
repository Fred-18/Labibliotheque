package com.labibliotheque.la_bibliotheque.mappers;

import com.labibliotheque.la_bibliotheque.dto.Category;
import com.labibliotheque.la_bibliotheque.repositories.models.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface CategoryMapper {
    Category toDto(CategoryEntity categoryEntity);
    CategoryEntity toEntity(Category category);
    
}
