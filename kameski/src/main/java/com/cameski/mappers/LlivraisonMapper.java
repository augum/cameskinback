package com.cameski.mappers;

import com.cameski.dto.LlivraisonRequestDto;
import com.cameski.dto.LlivraisonResponseDto;
import com.cameski.enties.Llivraison;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LlivraisonMapper {
    LlivraisonResponseDto fromLlivraison(Llivraison llivraison);
    Llivraison fromLlivraisonRequestDto(LlivraisonRequestDto  llivraisonRequestDto);
}
