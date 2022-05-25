package com.cameski.web;

import com.cameski.dto.ArticleResponseDto;
import com.cameski.dto.CommandeRequestDto;
import com.cameski.dto.CommandeResponseDto;
import com.cameski.service.CommandeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class CommandeController {
    private CommandeService commandeService;

    @PostMapping(path = "/commandes")
    public CommandeResponseDto save(@RequestBody CommandeRequestDto commandeRequestDto){
        log.info("**************************"+commandeRequestDto.toString()+"**********************");
       return commandeService.save(commandeRequestDto);
    }
    @GetMapping(path = "/commandefalses")
    public List<CommandeResponseDto> listeCommandeFalse(){
        return  commandeService.listeOrderFalse();
    }
}
