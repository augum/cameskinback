package com.cameski.mappers;

import com.cameski.dto.DepotArticleStockRequestDto;
import com.cameski.dto.DepotArticleStockResponseDto;
import com.cameski.enties.DepotArticleStock;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepotStockMapper {
    DepotArticleStockResponseDto fromDepotStock(DepotArticleStock depotArticleStock);
    DepotArticleStock fromdepotStockRequestDto(DepotArticleStockRequestDto depotArticleStockRequestDto);
}
