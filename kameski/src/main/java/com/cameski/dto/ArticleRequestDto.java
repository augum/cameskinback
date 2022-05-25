package com.cameski.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class ArticleRequestDto {
    private Long id;
    private String libelle;
    private double prixAchat;
    private double prixVente;
}
