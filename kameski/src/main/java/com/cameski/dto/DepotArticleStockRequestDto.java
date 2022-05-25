package com.cameski.dto;

import com.cameski.enties.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor @AllArgsConstructor
public class DepotArticleStockRequestDto {
    private Long id;
    private Long id_article;
    private String nom_article;
    private String lot;
    private LocalDate dateExpiration;
    private int qte;
    private Long id_magasin;
}
