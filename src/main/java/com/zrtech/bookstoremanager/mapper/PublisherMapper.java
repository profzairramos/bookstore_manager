package com.zrtech.bookstoremanager.mapper;

import com.zrtech.bookstoremanager.dto.PublisherDTO;
import com.zrtech.bookstoremanager.entities.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    Publisher toModel(PublisherDTO publisherDTO);

    PublisherDTO toDTO(Publisher publisher);
}
