package com.cameski.service;

import com.cameski.dto.FactureMobileRequestDto;
import com.cameski.dto.FactureMobileResponseDto;

import java.util.List;

public interface FactureMobileService {
    FactureMobileResponseDto save(FactureMobileRequestDto requestDto);
    FactureMobileResponseDto update(Long id,FactureMobileRequestDto factureMobileRequestDto);
    FactureMobileResponseDto getOrder(Long id);
    List<FactureMobileResponseDto> listeOrder();
}
