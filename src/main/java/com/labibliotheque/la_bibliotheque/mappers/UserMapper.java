package com.labibliotheque.la_bibliotheque.mappers;

import com.labibliotheque.la_bibliotheque.models.User;
import com.labibliotheque.la_bibliotheque.repositories.models.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toDto(UserEntity userEntity);

    UserEntity toEntity(User user);

}
