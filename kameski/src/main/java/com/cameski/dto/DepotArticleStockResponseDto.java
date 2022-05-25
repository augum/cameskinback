package com.cameski.dto;

import com.cameski.enties.Article;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor
public class DepotArticleStockResponseDto {
    private Long id;
    private Long id_article;
    private String nom_article;
    private Article article;
    private String lot;
    private LocalDate dateExpiration;
    private int qte;
    private Long id_magasin;
}
