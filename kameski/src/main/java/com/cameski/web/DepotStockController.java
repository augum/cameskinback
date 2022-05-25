package com.cameski.web;

import com.cameski.dto.DepotArticleStockRequestDto;
import com.cameski.dto.DepotArticleStockResponseDto;
import com.cameski.dto.LcommandeResponseDto;
import com.cameski.dto.MobileStockRequestDto;
import com.cameski.service.DepotstockService;
import com.cameski.service.MobileStockService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class DepotStockController {
    private DepotstockService service;
    private MobileStockService mobileStockService;
    @RequestMapping(path = "/stockdepots")
    public DepotArticleStockResponseDto save(@RequestBody DepotArticleStockRequestDto requestDto){
        return  service.stockdepot(requestDto);
    }
    @RequestMapping(path = "/stockdepotmoins")
    public DepotArticleStockResponseDto update(@RequestBody DepotArticleStockRequestDto requestDto){

        log.info("*****************"+ requestDto.toString()+"+++++++++++++++++++++++++++");
        /*
        *  les lignes de code qui suivent permettent de modifier au meme moment le stock
        * du depot(soustraction) et d'ajouter le stock de mobile par rapport à l'identifiant du mobile
        * */
        MobileStockRequestDto mobileStockRequestDto = new MobileStockRequestDto();
        mobileStockRequestDto.setId_article(requestDto.getId_article());
        mobileStockRequestDto.setLot(requestDto.getLot());
        mobileStockRequestDto.setQte(requestDto.getQte());
        mobileStockRequestDto.setId_magasin(requestDto.getId_magasin());
        mobileStockService.save(mobileStockRequestDto);
        return  service.updateStockDepotD(requestDto);
    }

    @GetMapping(path = "/stockdepots")
    public List<DepotArticleStockResponseDto> getListOrderIte(){
        return service.listeStockDepot();
    }
    @GetMapping(path = "/stockdepotsearchs")
    public List<DepotArticleStockResponseDto> getListLibelle(@RequestParam(name = "nom") String nom ){
        return service.getArticle(nom);
    }

    @GetMapping(path = "/stockdepotarticleid")
    public List<DepotArticleStockResponseDto> getListArticleid(@RequestParam(name = "id") Long id ) {
        return service.listeStockArticleId(id);
    }
    }
