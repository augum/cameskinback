package com.cameski.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class UsersRequestDto {
    private Long id;
    private String nom;
    private String email;
}
