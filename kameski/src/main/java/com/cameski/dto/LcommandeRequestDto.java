package com.cameski.dto;
import com.cameski.enties.Commande;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class LcommandeRequestDto {
    private Long id;
    private Long articleId;
    private int quantity;
    private Commande command;
}
