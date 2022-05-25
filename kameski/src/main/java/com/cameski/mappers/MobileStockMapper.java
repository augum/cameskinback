package com.cameski.mappers;

import com.cameski.dto.MobileStockRequestDto;
import com.cameski.dto.MobileStockResponseDto;
import com.cameski.dto.MobilesResponseDto;
import com.cameski.enties.MobileStock;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MobileStockMapper {
    MobileStockResponseDto fromMobileStock(MobileStock mobileStock);
    MobileStock fromMobilestockRequestDto(MobileStockRequestDto mobileStockRequestDto);
}
