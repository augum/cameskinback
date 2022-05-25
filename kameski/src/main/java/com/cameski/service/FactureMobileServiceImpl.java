package com.cameski.service;

import com.cameski.dto.FactureMobileRequestDto;
import com.cameski.dto.FactureMobileResponseDto;
import com.cameski.enties.FactureMobile;
import com.cameski.enties.LfactureMobile;
import com.cameski.mappers.FactureMobileMapper;
import com.cameski.repositories.FactureMobileRepository;
import com.cameski.repositories.LfactureMobileReposiriry;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
@Slf4j
public class FactureMobileServiceImpl implements FactureMobileService {
    private FactureMobileRepository repository;
    private FactureMobileMapper mapper;
    private LfactureMobileReposiriry lfactureMobileReposiriry;
    @Override
    public FactureMobileResponseDto save(FactureMobileRequestDto requestDto) {
        FactureMobile factureMobile = mapper.fromFactureMobileRequestdto(requestDto);
        factureMobile.setDate(new Date());
        FactureMobile mobile = repository.save(factureMobile);
        for(LfactureMobile lfact: factureMobile.getLfactureMobiles()){
            LfactureMobile lfactureMobile1 = new LfactureMobile();
            lfactureMobile1.setArticleId(lfact.getArticleId());
            lfactureMobile1.setQuantity((lfact.getQuantity()));
            lfactureMobile1.setFacture(factureMobile);
            lfactureMobileReposiriry.save(lfactureMobile1);
        }
        FactureMobileResponseDto responseDto = mapper.fromFactureMobile(mobile);
        return responseDto;
    }

    @Override
    public FactureMobileResponseDto update(Long id, FactureMobileRequestDto factureMobileRequestDto) {
        return null;
    }

    @Override
    public FactureMobileResponseDto getOrder(Long id) {
        return null;
    }

    @Override
    public List<FactureMobileResponseDto> listeOrder() {
        return null;
    }
}
