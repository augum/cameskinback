package com.cameski.mappers;

import com.cameski.dto.LfactureMobileRequestDto;
import com.cameski.dto.LfactureMobileResponseDto;
import com.cameski.enties.LfactureMobile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LfactureMobileMapper {
    LfactureMobileResponseDto fromLfactureMobile(LfactureMobile lfactureMobile);
    LfactureMobile fromLfactureMobileRequestDto(LfactureMobileRequestDto lfactureMobileRequestDto);
}
