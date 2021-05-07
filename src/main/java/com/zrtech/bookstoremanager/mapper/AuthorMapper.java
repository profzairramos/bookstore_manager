package com.zrtech.bookstoremanager.mapper;

import com.zrtech.bookstoremanager.dto.AuthorDTO;
import com.zrtech.bookstoremanager.entities.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO(Author author);

}
