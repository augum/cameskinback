package com.cameski.service;

import com.cameski.dto.CommandeRequestDto;
import com.cameski.dto.CommandeResponseDto;

import java.util.List;

public interface CommandeService {
    CommandeResponseDto save(CommandeRequestDto requestDto);
    CommandeResponseDto update(Long id,CommandeRequestDto commandeRequestDto);
    CommandeResponseDto getOrder(Long id);
    List<CommandeResponseDto> listeOrder();
    List<CommandeResponseDto> listeOrderFalse();
}
