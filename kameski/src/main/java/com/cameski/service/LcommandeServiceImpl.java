package com.cameski.service;

import com.cameski.dto.LcommandeRequestDto;
import com.cameski.dto.LcommandeResponseDto;
import com.cameski.enties.Article;
import com.cameski.enties.Commande;
import com.cameski.enties.Lcommande;
import com.cameski.mappers.LcommandeMapper;
import com.cameski.repositories.ArticleRepository;
import com.cameski.repositories.LcommandeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
@Slf4j
public class LcommandeServiceImpl implements LcommandeService {
    private LcommandeRepository lcommandeRepository;
    private ArticleRepository articleRepository;
    private LcommandeMapper mapper;

    @Override
    public LcommandeResponseDto save(LcommandeRequestDto requestDto) {
        return null;
    }

    @Override
    public List<LcommandeResponseDto> listeLcommande() {
        List<Lcommande> lcommandes = lcommandeRepository.findAll();
        for(Lcommande lcommande:lcommandes){
            Article product = articleRepository.getById(lcommande.getArticleId());
            lcommande.setArticle(product);
        }
        return lcommandes.stream().map(lcommande -> mapper.fromLcommande(lcommande))
                .collect(Collectors.toList());
    }

    @Override
    public List<LcommandeResponseDto> listeOrderItemO(Commande commande) {
        List<Lcommande> lcommandes = lcommandeRepository.listeLcommandeByOrder(commande);
        for(Lcommande lcommande:lcommandes){
            Article product = articleRepository.getById(lcommande.getArticleId());
            lcommande.setArticle(product);
        }
        return lcommandes.stream().map(ordreItem -> mapper.fromLcommande(ordreItem))
                .collect(Collectors.toList());
    }
}
