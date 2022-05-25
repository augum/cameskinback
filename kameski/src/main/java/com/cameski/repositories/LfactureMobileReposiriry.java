package com.cameski.repositories;

import com.cameski.enties.Commande;
import com.cameski.enties.FactureMobile;
import com.cameski.enties.Lcommande;
import com.cameski.enties.LfactureMobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LfactureMobileReposiriry  extends JpaRepository<LfactureMobile,Long> {
    @Query("select c from LfactureMobile c where c.facture =:o")
    public List<LfactureMobile> listeLcommandeByOrder(@Param("o") FactureMobile factureMobile);
}
