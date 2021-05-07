package com.zrtech.bookstoremanager.mapper;

import com.zrtech.bookstoremanager.dto.BookDTO;
import com.zrtech.bookstoremanager.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);

}
