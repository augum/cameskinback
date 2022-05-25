package com.cameski.dto;

import com.cameski.enties.Lcommande;
import com.cameski.enties.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class CommandeRequestDto {
    private Long id;
    private Long id_mobile;
    private String nom_mobile;
    private Long id_user;
    private LocalDate date;
    private boolean served;
    private Collection<Lcommande> lCommande;
    private double totalAmount;
}
