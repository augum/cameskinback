package com.cameski.mappers;

import com.cameski.dto.FactureMobileRequestDto;
import com.cameski.dto.FactureMobileResponseDto;
import com.cameski.enties.FactureMobile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FactureMobileMapper {
    FactureMobileResponseDto fromFactureMobile(FactureMobile factureMobile);
    FactureMobile fromFactureMobileRequestdto(FactureMobileRequestDto factureMobileRequestDto);
}
