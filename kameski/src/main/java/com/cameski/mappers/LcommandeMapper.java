package com.cameski.mappers;

import com.cameski.dto.LcommandeRequestDto;
import com.cameski.dto.LcommandeResponseDto;
import com.cameski.enties.Lcommande;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LcommandeMapper {
    LcommandeResponseDto fromLcommande(Lcommande lcommande);
    Lcommande fromLcommandeRequestDto(LcommandeRequestDto lcommandeRequestDto);
}
