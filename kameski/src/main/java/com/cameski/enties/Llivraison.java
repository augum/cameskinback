package com.cameski.enties;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Llivraison {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long articleId;
    @Transient
    private Article article;
    private int quantity;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Livraison livraison;
}
