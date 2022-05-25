package com.cameski.mappers;

import com.cameski.dto.MobilesRequestDto;
import com.cameski.dto.MobilesResponseDto;
import com.cameski.enties.Mobiles;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MobileMapper {
    MobilesResponseDto fromMobile(Mobiles mobiles);
    Mobiles fromMobilesRequestDto(MobilesRequestDto mobilesRequestDto);
}
