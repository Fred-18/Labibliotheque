package com.labibliotheque.la_bibliotheque.mappers;

import com.labibliotheque.la_bibliotheque.models.Role;
import com.labibliotheque.la_bibliotheque.repositories.models.RoleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface RoleMapper {
    Role toDto(RoleEntity roleEntity);
    RoleEntity toEntity(Role role);
    
}
