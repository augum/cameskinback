package com.cameski.service;

import com.cameski.dto.ArticleResponseDto;
import com.cameski.dto.DepotArticleStockRequestDto;
import com.cameski.dto.DepotArticleStockResponseDto;
import com.cameski.enties.Article;
import com.cameski.enties.DepotArticleStock;
import com.cameski.enties.Lcommande;
import com.cameski.enties.MobileStock;
import com.cameski.mappers.DepotStockMapper;
import com.cameski.repositories.ArticleRepository;
import com.cameski.repositories.DepotStockRepository;
import com.cameski.repositories.MobileStockRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class DepotstockServiceImpl implements DepotstockService {
    private DepotStockRepository repository;
    private ArticleRepository articleRepository;
    private DepotStockMapper mapper;
    @Override
    public DepotArticleStockResponseDto stockdepot(DepotArticleStockRequestDto requestDto) {
        DepotArticleStock articleStock = mapper.fromdepotStockRequestDto(requestDto);
        Optional<DepotArticleStock> stockreel = Optional.ofNullable(repository.depotArticleOne(articleStock.getId_article(), articleStock.getLot()));
         if(stockreel.isPresent()){
             DepotArticleStock Ds= stockreel.get();
             Ds.setQte(Ds.getQte() + articleStock.getQte());
             Ds = repository.save(Ds);
             DepotArticleStockResponseDto responseDtods = mapper.fromDepotStock(Ds);
             return responseDtods;
         }else {
             DepotArticleStock save = repository.save(articleStock);
             DepotArticleStockResponseDto responseDto = mapper.fromDepotStock(save);
             return responseDto;
         }
    }

    @Override
    public DepotArticleStockResponseDto updateStockDepotS(DepotArticleStockRequestDto depotArticleStockRequestDto) {
        return null;
    }

    @Override
    public DepotArticleStockResponseDto updateStockDepotD(DepotArticleStockRequestDto depotArticleStockRequestDto) {
        DepotArticleStock articleStock = mapper.fromdepotStockRequestDto(depotArticleStockRequestDto);
        // on verifie si le produit est dans la base
        Optional<DepotArticleStock> stockreel = Optional.ofNullable(repository.depotArticleOne(articleStock.getId_article(), articleStock.getLot()));
        if(stockreel.isPresent()){
            DepotArticleStock Ds= stockreel.get();
            if(Ds.getQte() < articleStock.getQte()){
                return null;
            }
            Ds.setQte(Ds.getQte() - articleStock.getQte());
            Ds = repository.save(Ds);
            DepotArticleStockResponseDto responseDtods = mapper.fromDepotStock(Ds);
            return responseDtods;
        }

        return null;
    }

    @Override
    public List<DepotArticleStockResponseDto> listeStockDepot() {
        List<DepotArticleStock> lcommandes = repository.findAll();
        for(DepotArticleStock lcommande:lcommandes){
            Article product = articleRepository.getById(lcommande.getId_article());
            lcommande.setArticle(product);
        }
        return lcommandes.stream().map(ordreItem -> mapper.fromDepotStock(ordreItem))
                .collect(Collectors.toList());
    }

    @Override
    public List<DepotArticleStockResponseDto> listeStockArticleId(Long id) {
        List<DepotArticleStock> lcommandes = repository.depotArticleid(id);
        for(DepotArticleStock lcommande:lcommandes){
            Article product = articleRepository.getById(lcommande.getId_article());
            lcommande.setArticle(product);
        }
        return lcommandes.stream().map(ordreItem -> mapper.fromDepotStock(ordreItem))
                .collect(Collectors.toList());
    }

    @Override
    public List<DepotArticleStockResponseDto> getArticle(String nom) {
        List<DepotArticleStock> lcommandes = repository.depotArticles(nom);
        for(DepotArticleStock lcommande:lcommandes){
            Article product = articleRepository.getById(lcommande.getId_article());
            lcommande.setArticle(product);
        }
        return lcommandes.stream().map(ordreItem -> mapper.fromDepotStock(ordreItem))
                .collect(Collectors.toList());
    }
}
