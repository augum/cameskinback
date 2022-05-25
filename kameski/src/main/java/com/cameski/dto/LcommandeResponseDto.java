package com.cameski.dto;

import com.cameski.enties.Article;
import com.cameski.enties.Commande;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class LcommandeResponseDto {
    private Long id;
    private Long articleId;
    private Article article;
    private int quantity;
    private Commande command;
}
