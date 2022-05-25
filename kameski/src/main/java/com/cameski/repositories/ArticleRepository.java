package com.cameski.repositories;

import com.cameski.enties.Article;
import com.cameski.enties.DepotArticleStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository  extends JpaRepository <Article, Long> {
    @Query("select a from Article a where a.libelle like :nom%")
    List<Article> articles(@Param("nom") String nom);
}
