package com.cameski.dto;

import com.cameski.enties.Article;
import com.cameski.enties.FactureMobile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class LfactureMobileRequestDto {
    private Long id;
    private Long articleId;
    private int quantity;
    private FactureMobile factureMobile;
}
