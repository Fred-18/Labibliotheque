package com.labibliotheque.la_bibliotheque.mappers;

import com.labibliotheque.la_bibliotheque.models.Comment;
import com.labibliotheque.la_bibliotheque.repositories.models.CommentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface CommentMapper {
    Comment toDto(CommentEntity commentEntity);
    CommentEntity toEntity(Comment comment);
    
}
