package com.cameski.enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Data @Entity @AllArgsConstructor @NoArgsConstructor
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_mobile;
    private Long id_user;
    @Transient
    private Users user;
    private Date date;
    @OneToMany(mappedBy = "livraison")
    private Collection<Llivraison> llivraisons;
    private double totalAmount;
}
