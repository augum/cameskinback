package com.cameski.dto;

import com.cameski.enties.Article;
import com.cameski.enties.FactureMobile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor @NoArgsConstructor
public class LfactureMobileResponseDto {
    private Long id;
    private Long articleId;
    private Article article;
    private int quantity;
    private FactureMobile factureMobile;
}
