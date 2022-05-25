package com.cameski.service;

import com.cameski.dto.MobileStockRequestDto;
import com.cameski.dto.MobileStockResponseDto;
import com.cameski.dto.MobilesResponseDto;

public interface MobileStockService {
    MobileStockResponseDto save(MobileStockRequestDto mobileStockRequestDto);
}
