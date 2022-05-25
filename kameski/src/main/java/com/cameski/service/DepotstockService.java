package com.cameski.service;

import com.cameski.dto.ArticleResponseDto;
import com.cameski.dto.DepotArticleStockRequestDto;
import com.cameski.dto.DepotArticleStockResponseDto;

import java.util.List;

public interface DepotstockService {
    DepotArticleStockResponseDto stockdepot(DepotArticleStockRequestDto requestDto);
    DepotArticleStockResponseDto updateStockDepotS(DepotArticleStockRequestDto depotArticleStockRequestDto);
    DepotArticleStockResponseDto updateStockDepotD(DepotArticleStockRequestDto depotArticleStockRequestDto);
    List<DepotArticleStockResponseDto> listeStockDepot();
    List<DepotArticleStockResponseDto> listeStockArticleId(Long id);
    List<DepotArticleStockResponseDto>  getArticle(String nom);
}
