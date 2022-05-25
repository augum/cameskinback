package com.cameski.enties;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class MobileStock {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_article;
    @Transient
    private Article article;
    @Transient
    private String lot;
    private int qte;
    private Long id_magasin;
}
