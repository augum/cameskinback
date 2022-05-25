package com.cameski.service;

import com.cameski.dto.ArticleRequestDto;
import com.cameski.dto.ArticleResponseDto;

import java.util.List;

public interface ArticleService {
    ArticleResponseDto save(ArticleRequestDto articleRequestDto);
    ArticleResponseDto update(Long id,ArticleRequestDto articleRequestDto);
    ArticleResponseDto getArticle(Long id);
    String deleteArticle(Long id);
    List<ArticleResponseDto> listeArticle();
    List<ArticleResponseDto> listeArticle(String nom);
}
