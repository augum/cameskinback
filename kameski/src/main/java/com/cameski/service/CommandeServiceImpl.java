package com.cameski.service;

import com.cameski.dto.CommandeRequestDto;
import com.cameski.dto.CommandeResponseDto;
import com.cameski.enties.Article;
import com.cameski.enties.Commande;
import com.cameski.enties.Lcommande;
import com.cameski.enties.Mobiles;
import com.cameski.mappers.CommandeMapper;
import com.cameski.repositories.CommandeRepository;
import com.cameski.repositories.LcommandeRepository;
import com.cameski.repositories.MobileStockRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class CommandeServiceImpl implements CommandeService {
    private CommandeRepository commandeRepository;
    private MobileStockRepository mobileStockRepository;
    private CommandeMapper mapper;
    private LcommandeRepository lcommandeRepository;
    @Override
    public CommandeResponseDto save(CommandeRequestDto requestDto) {
        Commande commande = mapper.fromCommandeRequestDto(requestDto);
        log.info(commande.toString());
        commande.setDate(LocalDate.now());
        commande.setServed(false);
        Commande saveCommande = commandeRepository.save(commande);

        for (Lcommande o : commande.getLCommande()){
            Lcommande lcommande = new Lcommande();
            lcommande.setCommand(commande);
            lcommande.setArticleId(o.getArticleId());
            lcommande.setQuantity(o.getQuantity());
            lcommandeRepository.save(lcommande);
        }
        CommandeResponseDto responseDto = mapper.fromCommande(saveCommande);
        return responseDto;
    }

    @Override
    public CommandeResponseDto update(Long id, CommandeRequestDto commandeRequestDto) {
        return null;
    }

    @Override
    public CommandeResponseDto getOrder(Long id) {
        return null;
    }

    @Override
    public List<CommandeResponseDto> listeOrder() {
        return null;
    }

    @Override
    public List<CommandeResponseDto> listeOrderFalse() {
        List<Commande> commandes = commandeRepository.commandes();
        return commandes.stream().map(commande -> mapper.fromCommande(commande))
                .collect(Collectors.toList());
    }
}
