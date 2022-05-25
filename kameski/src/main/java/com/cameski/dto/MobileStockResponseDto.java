package com.cameski.dto;

import com.cameski.enties.Article;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Transient;
import java.time.LocalDate;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class MobileStockResponseDto {
    private Long id;
    private Long id_article;
    private Article article;
    private String lot;
    private int qte;
    private Long id_magasin;
}
