package com.cameski.service;

import com.cameski.dto.ArticleRequestDto;
import com.cameski.dto.ArticleResponseDto;
import com.cameski.enties.Article;
import com.cameski.mappers.ArticleMapper;
import com.cameski.repositories.ArticleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class ArticleServiceImpl implements ArticleService {
    private ArticleRepository articleRepository;
    private ArticleMapper articleMapper;
    @Override
    public ArticleResponseDto save(ArticleRequestDto articleRequestDto) {
        // cette methode permet d'enregistrer un article
        Article article = articleMapper.fromArticleRequestDto(articleRequestDto);
        Article saveArticle =  articleRepository.save(article);
        ArticleResponseDto responseDto = articleMapper.fromArticle(saveArticle);
        return responseDto;
    }

    @Override
    public ArticleResponseDto update(Long id, ArticleRequestDto articleRequestDto) {
        Article article = articleRepository.findById(id).get();
        article.setLibelle(articleRequestDto.getLibelle());
        Article saveArticle = articleRepository.save(article);
        return articleMapper.fromArticle(saveArticle);
    }

    @Override
    public ArticleResponseDto getArticle(Long id) {
       /* La selection d'un article par son id */
        Article article = articleRepository.findById(id).get();
        return articleMapper.fromArticle(article);
    }

    @Override
    public String deleteArticle(Long id) {
        Article article = articleRepository.findById(id).get();
         if(article.getId() != null){
             articleRepository.deleteById(id);
             return "article supprimé avec succès";
         }else{
             return " Cet article n'existe pas";
         }

    }

    @Override
    public List<ArticleResponseDto> listeArticle() {
        /* Retourne la liste des articles */
        List<Article> articles = articleRepository.findAll();
        return articles.stream().map(article -> articleMapper.fromArticle(article))
                .collect(Collectors.toList());
    }

    @Override
    public List<ArticleResponseDto> listeArticle(String nom) {
        List<Article> articles = articleRepository.articles(nom);
        return articles.stream().map(article -> articleMapper.fromArticle(article))
                .collect(Collectors.toList());
    }
}
