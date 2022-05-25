package com.cameski.dto;

import com.cameski.enties.LfactureMobile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor
public class FactureMobileRequestDto {
    private Long id;
    private Long user_id;
    private String nomClient;
    private LocalDate date;
    private Collection<LfactureMobile> lfactureMobiles;
    private double totalAmount;
}
