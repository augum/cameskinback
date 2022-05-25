package com.cameski.mappers;

import com.cameski.dto.ArticleRequestDto;
import com.cameski.dto.ArticleResponseDto;
import com.cameski.enties.Article;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
  ArticleResponseDto fromArticle(Article article);
  Article fromArticleRequestDto(ArticleRequestDto articleRequestDto);
}
