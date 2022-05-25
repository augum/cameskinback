package com.cameski.web;

import com.cameski.dto.LcommandeResponseDto;
import com.cameski.enties.Commande;
import com.cameski.service.LcommandeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class LcommandeController {
    private LcommandeService lcommandeService;

    @GetMapping(path = "/lcommandes")
    public List<LcommandeResponseDto> getListOrderIte(){
        return lcommandeService.listeLcommande();
    }
    @GetMapping(path = "/lcommandesls")
    public List<LcommandeResponseDto> getListLcommande(@RequestParam(name = "com") Commande o){
        return lcommandeService.listeOrderItemO(o);
    }
}
