package com.cameski.repositories;

import com.cameski.enties.DepotArticleStock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface DepotStockRepository extends JpaRepository<DepotArticleStock, Long> {
    @Query("select a from DepotArticleStock a where a.id_article= :idArt and a.lot=:lot ")
    public DepotArticleStock depotArticleOne(@Param("idArt") Long idArt, @Param("lot") String lot);

    @Query("select a from DepotArticleStock a where a.id_article= :idArt")
    List<DepotArticleStock> depotArticleid(@Param("idArt") Long idArt);

    @Query("select a from DepotArticleStock a where a.nom_article like :nom%")
    List<DepotArticleStock> depotArticles(@Param("nom") String nom);

}
