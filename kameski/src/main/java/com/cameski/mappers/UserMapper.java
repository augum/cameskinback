package com.cameski.mappers;

import com.cameski.dto.UsersRequestDto;
import com.cameski.dto.UsersResponseDto;
import com.cameski.enties.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UsersResponseDto fromUser(Users users);
    Users fromUserRequestDto(UsersRequestDto usersRequestDto);
}
