package com.cameski.enties;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data @Entity @AllArgsConstructor @NoArgsConstructor
public class DepotArticleStock {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_article;
    private String nom_article;
    @Transient
    private Article article;
    private String lot;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateExpiration;
    private int qte;
    @Transient
    private Long id_magasin;
}
