package com.cameski.dto;

import com.cameski.enties.LfactureMobile;
import com.cameski.enties.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor
public class FactureMobileResponseDto {
    private Long id;
    private Long user_id;
    private Users user;
    private String nomClient;
    private LocalDate date;
    private Collection<LfactureMobile> lfactureMobiles;
    private double totalAmount;
}
