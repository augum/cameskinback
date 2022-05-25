package com.cameski.mappers;

import com.cameski.dto.LivraisonRequestDto;
import com.cameski.dto.LivraisonResponseDto;
import com.cameski.enties.Livraison;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivraisonMapper {
    LivraisonResponseDto fromLivraison(Livraison livraison);
    Livraison fromLivraisonRequestDto(LivraisonRequestDto livraisonRequestDto);
}
