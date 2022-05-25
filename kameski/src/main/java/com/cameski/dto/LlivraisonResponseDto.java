package com.cameski.dto;

import com.cameski.enties.Article;
import com.cameski.enties.Livraison;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class LlivraisonResponseDto {
    private Long id;
    private Long articleId;

    private Article article;
    private int quantity;
    private Livraison livraison;
}
