package com.cameski.repositories;

import com.cameski.enties.Commande;
import com.cameski.enties.Lcommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LcommandeRepository extends JpaRepository<Lcommande,Long> {
    @Query("select c from Lcommande c where c.command =:o")
    public List<Lcommande> listeLcommandeByOrder(@Param("o") Commande commande);
}
