package com.cameski.mappers;

import com.cameski.dto.CommandeRequestDto;
import com.cameski.dto.CommandeResponseDto;
import com.cameski.enties.Commande;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommandeMapper {
    CommandeResponseDto fromCommande(Commande commande);
    Commande fromCommandeRequestDto(CommandeRequestDto commandeRequestDto);
}
