package com.cameski.repositories;

import com.cameski.enties.Article;
import com.cameski.enties.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommandeRepository  extends JpaRepository<Commande,Long> {
    @Query("select a from Commande a where a.served = false")
    List<Commande> commandes();
}
