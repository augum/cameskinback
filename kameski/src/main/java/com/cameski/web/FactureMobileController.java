package com.cameski.web;

import com.cameski.dto.CommandeRequestDto;
import com.cameski.dto.CommandeResponseDto;
import com.cameski.dto.FactureMobileRequestDto;
import com.cameski.dto.FactureMobileResponseDto;
import com.cameski.service.FactureMobileService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class FactureMobileController {
    private FactureMobileService service;
    @PostMapping(path = "/facturesmobiles")
    public FactureMobileResponseDto save(@RequestBody FactureMobileRequestDto factureMobileRequestDto){
        return service.save(factureMobileRequestDto);
    }
}
