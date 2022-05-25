package com.cameski.web;

import com.cameski.dto.ArticleRequestDto;
import com.cameski.dto.ArticleResponseDto;
import com.cameski.dto.DepotArticleStockResponseDto;
import com.cameski.service.ArticleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class ArticleController {
    private ArticleService articleService;

    @PostMapping(path = "/articles")
    public ArticleResponseDto save(@RequestBody  ArticleRequestDto requestDto){
    return articleService.save(requestDto);
 }

  @PutMapping(path = "/articles/{id}")
   public ArticleResponseDto updateArticle(@PathVariable Long id, @RequestBody ArticleRequestDto articleRequestDto){
       return articleService.update(id,articleRequestDto);
  }
    @GetMapping(path = "/articles")
    public List<ArticleResponseDto> listeArticle(){
        return  articleService.listeArticle();
    }
    @GetMapping(path = "/articlesearchs")
    public List<ArticleResponseDto> getListLibelle(@RequestParam(name = "nom") String nom ){
        return articleService.listeArticle(nom);
    }
    @GetMapping(path = "/articles/{id}")
    public ArticleResponseDto getArticle(@PathVariable Long id){
     return  articleService.getArticle(id);
    }
    @DeleteMapping(path = "/articles/{id}")
    public String deleteArticle(@PathVariable Long id){
        return  articleService.deleteArticle(id);
    }
}
