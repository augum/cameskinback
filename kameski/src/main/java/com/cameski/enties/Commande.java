package com.cameski.enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

@Data
@Entity @NoArgsConstructor @AllArgsConstructor
public class Commande {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_mobile;
    private String nom_mobile;
    private Long id_user;
    private boolean served;
    @Transient
    private Users user;
    private LocalDate date;
    @OneToMany(mappedBy = "command")
    private Collection<Lcommande> lCommande;
    private double totalAmount;
}
