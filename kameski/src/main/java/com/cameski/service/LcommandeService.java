package com.cameski.service;

import com.cameski.dto.LcommandeRequestDto;
import com.cameski.dto.LcommandeResponseDto;
import com.cameski.enties.Commande;

import java.util.List;

public interface LcommandeService {
    LcommandeResponseDto save(LcommandeRequestDto requestDto);
    List<LcommandeResponseDto> listeLcommande();
    List<LcommandeResponseDto> listeOrderItemO(Commande commande);
}
