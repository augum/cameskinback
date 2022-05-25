package com.cameski.dto;

import com.cameski.enties.Article;
import com.cameski.enties.Livraison;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor @NoArgsConstructor
public class LlivraisonRequestDto {
    private Long id;
    private Long articleId;
    private int quantity;
    private Livraison livraison;
}
