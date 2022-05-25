package com.cameski.repositories;

import com.cameski.enties.MobileStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MobileStockRepository extends JpaRepository<MobileStock,Long> {
    @Query("select a from MobileStock a where a.id_article= :idArt")
    public MobileStock mobileStockOne(@Param("idArt") Long idArt);

    @Query("select a from MobileStock a where a.id_magasin= :id_magasin")
    public MobileStock mobileStockMag(@Param("id_magasin") Long id_magasin);
}
