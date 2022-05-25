package com.cameski.dto;

import com.cameski.enties.Llivraison;
import com.cameski.enties.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.Collection;
import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor
public class LivraisonResponseDto {
    private Long id;
    private Long id_mobile;
    private Long id_user;
    private Users user;
    private Date date;
    private Collection<Llivraison> llivraisons;
    private double totalAmount;
}
