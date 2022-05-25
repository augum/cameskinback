package com.cameski.enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class FactureMobile {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user_id;
    @Transient
    private Users user;
    private String nomClient;
    private Date date;
    @OneToMany(mappedBy = "facture")
    private Collection<LfactureMobile> lfactureMobiles;
    private double totalAmount;
}
