package com.zrtech.bookstoremanager.mapper;

import com.zrtech.bookstoremanager.dto.UserDTO;
import com.zrtech.bookstoremanager.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toModel(UserDTO userDTO);

    UserDTO toDTO(User user);
}
